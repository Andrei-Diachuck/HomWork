package Project;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int b) {
        food += b;
    }

    public void info() {
        System.out.println("Еды в миске: " + food);
    }
}
