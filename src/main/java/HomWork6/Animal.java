package HomWork6;

public abstract class Animal {
    String type;
    String name;
    int run;
    int swim;
    private static int amount;


    public Animal(){
        amount++;
    }

    public static int getAmount(){
        return amount;
    }

    public String toString() {
        return ("Вид животного" + "\n"
                + type + "\n"
                + name + "\n"
                + " может пробежать= " + run + "\n"
                + " может проплыть= " + swim);
    }

    protected void run(int dis){
        if(run >= dis){
            System.out.println(this.type + " по имени " + name + " пробежал " + dis + " м");
        }else {
            System.out.println(this.type + " по имени " + name + " не может так далеко бегать");
        }
    }

    protected void swim(int disswim){
        if(swim >= disswim){
            System.out.println(this.type + " по имени " + name + " проплыл " + disswim + " м");
        }else {
            System.out.println(this.type + " по имени " + name + " не может так далеко пдавать");
        }
    }

    public abstract void amount();
}
