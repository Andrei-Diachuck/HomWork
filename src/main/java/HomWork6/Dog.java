package HomWork6;

public class Dog extends Animal {
    public Dog(String type, String name, int run, int swim){
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




