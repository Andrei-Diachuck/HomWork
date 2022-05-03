package HomWork6;

public class Cat extends Animal {
    public Cat(String type, String name, int run, int swim) {
        this.Type = type;
        this.Name = name;
        this.run = run;
        this.swim = swim;
        amount++;
    }

    private static int amount;

    public static int getAmount(){
        return amount;
    }
}
