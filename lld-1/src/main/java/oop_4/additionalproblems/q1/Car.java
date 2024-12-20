package oop_4.additionalproblems.q1;

public class Car implements Comparable<Car> {
    private int Price;
    private int Speed;

    @Override
    public int compareTo(Car o) {
        return this.Price - o.Price;
    }
}