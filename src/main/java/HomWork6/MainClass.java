package HomWork6;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Кот", "Рома", 200, 0);
        animals[1] = new Dog("Собака", "Лайма", 500, 10);
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].swim(0);
        }
        System.out.println("Всего животных: " + Animal.getAmount());
        System.out.println("Котов: " + Cat.getAmount());
        System.out.println("Собак: " + Dog.getAmount());
    }
}
