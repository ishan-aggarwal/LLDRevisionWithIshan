package collections.problems.q1;

public class Car implements Comparable<Car> {
    private int speed;
    private int power;

    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    @Override
    public int compareTo(Car other) {
        return this.speed - other.speed;
    }

    @Override
    public String toString() {
        return "[S=" + this.speed + ", P=" + this.power + "]";
    }
}