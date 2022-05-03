package HomWork6;

public abstract class Animal {
    protected String Type;
    protected String Name;
    protected int run;
    protected int swim;
    private static int amount;


    public Animal(){
        amount++;
    }

    public static int getAmount(){
        return amount;
    }

    public String toString() {
        return ("Вид животного" + "\n"
                + Type + "\n"
                + Name + "\n"
                + " может пробежать= " + run + "\n"
                + " может проплыть= " + swim);
    }

    protected void run(int dis){
        if(run >= dis){
            System.out.println(this.Type + " по имени " + Name + " пробежал " + dis + " м");
        }else {
            System.out.println(this.Type + " по имени " + Name + " не может так далеко бегать");
        }
    }

    protected void swim(int disswim){
        if(swim >= disswim){
            System.out.println(this.Type + " по имени " + Name + " проплыл " + disswim + " м");
        }else {
            System.out.println(this.Type + " по имени " + Name + " не может так далеко пдавать");
        }
    }

    public void amount(){

    }
}
