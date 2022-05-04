package HomWork6;

public class Cat extends Animal {
    public Cat(String type, String name, int run, int swim) {
        super.type = type;
        super.name = name;
        super.run = run;
        super.swim = swim;
        amount++;
    }

    private static int amount;

    public static int getAmount(){
        return amount;
    }

    @Override
    public void amount() {

    }
}
