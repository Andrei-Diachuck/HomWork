package HM5;

public class MainClass {
    public static void main(String[] args) {
        Employees[] emp = new Employees[5];
        emp[0] = new Employees("Ivan", "Ivanov", "HR", "1@", 16546, 25000, 20);
        emp[1] = new Employees("Pavel", "Sidorov", "Menager", "2@", 456621, 2316954, 25);
        emp[2] = new Employees("Vladiclav", "Petron", "Creator", "3@", 165652146, 954659, 40);
        emp[3] = new Employees("Igor", "Sidoriv", "Interpreter", "4@", 16546644, 9549, 45);
        emp[4] = new Employees("Ruskan", "Ivanov", "Accountant", "5@", 215646, 9549, 41);
        for (Employees employees : emp) {
            if (employees.getage() > 40){
                System.out.println(employees);
            }
        }


    }

}
