package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private Double LeftOperand;
    private String operation;

    public MyWindow() {
        setTitle("Wind");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 100, 400, 400);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 25));
        add(display, BorderLayout.NORTH);

        ActionListener buttonNegative = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                Double rightOperand = Double.parseDouble(display.getText());

                if ("+/-".equals(action)) {
                    display.setText(String.valueOf(rightOperand / -1));
                }
            }
        };

        ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();

                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                if ("0".equals(displayText) && !(".").equals(text)) {
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
            }
        };

        ActionListener buttonListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String action = source.getText();
                Double rightOperand = Double.parseDouble(display.getText());

                if ("=".equals(action)) {
                    if (LeftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(LeftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(LeftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(LeftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(LeftOperand / rightOperand));
                                break;
                        }
                        LeftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }

                LeftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");

                if ("C".equals(action)) {
                    LeftOperand = null;
                    display.setText("0");
                }
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(3, 4, 10, 10);
        numberPanel.setLayout(numberLayout);

        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        JButton negativeButton = new JButton("+/-");
        negativeButton.addActionListener(buttonNegative);

        numberPanel.add(pointButton);
        numberPanel.add(negativeButton);


        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(2, 3, 10, 10);
        buttonPanel.setLayout(buttonLayout);

        for (char c : "C+-*/=".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.WEST);
        add(numberPanel, BorderLayout.EAST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}