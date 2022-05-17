package Project;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 5, false);
        cats[2] = new Cat("Маркиз", 10, false);

        Plate plate = new Plate(5);
        plate.info();

        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                cat.eat(plate);
                System.out.println(cat.getName() + " сытый");
                plate.info();
            } else if (cat.getAppetite() > plate.getFood()) {
                System.out.println(cat.getName() + " не поел");
                System.out.println(cat.getName() + " нужно " + cat.getAppetite() + " еды ");
                plate.scanner();
            }
        }
        System.out.println("Все коты сыты");
    }
}
