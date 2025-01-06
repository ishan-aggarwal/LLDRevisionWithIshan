package solid.so.design.bird.v2;

public class Peacock extends Bird implements Flyable, Dancer {
    @Override
    public void fly() {
        System.out.println(this.getType() + "is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getType() + "is sounding Peapea.");
    }

    @Override
    public void dance() {
        System.out.println(this.getType() + "is dancing.");
    }
}
