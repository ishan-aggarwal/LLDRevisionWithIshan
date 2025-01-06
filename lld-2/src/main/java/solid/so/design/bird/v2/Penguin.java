package solid.so.design.bird.v2;

public class Penguin extends Bird implements Dancer {

    @Override
    public void makeSound() {
        System.out.println(this.getType() + "is sounding Ooooo.");
    }

    @Override
    public void dance() {
        System.out.println(this.getType() + "is dancing.");
    }
}
