package Project;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int adding;
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 5, false);
        cats[2] = new Cat("Маркиз", 10, false);

        Plate plate = new Plate(10);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].getAppetite() <= plate.getFood()) {
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println("Кот " + cats[i].getName() + " съел " + cats[i].getAppetite());
            } else {
                System.out.println("Коту " + cats[i].getName() + " не хватило еды");
            }
        }

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == true) {
                System.out.println(cats[i].getName() + " сытый");
            } else {
                plate.info();
                System.out.println("Сколько еды нужно еще добавить ?");
                adding = sc.nextInt();
                plate.increaseFood(adding);

            }
        }
        System.out.println("Все коты сыты");

    }
}
