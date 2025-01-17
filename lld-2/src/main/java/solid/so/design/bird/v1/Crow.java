package solid.so.design.bird.v1;

public class Crow extends Bird {
    @Override
    public void fly() {
        System.out.println(this.getType() + "is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getType() + "is sounding Kawkaw.");
    }
}
