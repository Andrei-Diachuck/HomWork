package HomWork6;

public class Dog extends Animal {
    public Dog(String type, String name, int run, int swim){
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




