package Project;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int adding;
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 5, false);
        cats[2] = new Cat("Маркиз", 10, false);

        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                cat.eat(plate);
                System.out.println(cat.getName() + " сытый");
                plate.info();
            } else if (cat.getAppetite() >= plate.getFood()) {
                System.out.println(cat.getName() + " не поел");
                System.out.println(cat.getName() + " нужно " + cat.getAppetite() + " еды ");
                adding = sc.nextInt();
                plate.increaseFood(adding);
                cat.eat(plate);
                plate.info();
            }
        }
    }
}
