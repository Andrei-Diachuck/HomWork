package Project;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    protected void decreaseFood(int n) {
        food -= n;
    }

    protected void increaseFood(int b) {
        food += b;
    }

    public void info() {
        if (food < 0){
            System.out.println("Столько еды нельзя добавить )))");
        }else {
            System.out.println("Еды в миске: " + food);
        }
    }
}
