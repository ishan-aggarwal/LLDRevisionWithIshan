package oop_3.problems.q1;

public class ThreedPoint extends Point {
    private int z;

    @Override
    public void display() {
        System.out.println("[" + x + ", " + y + ", " + z + "]");
    }
}
