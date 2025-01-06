package solid.so.design.bird.v1;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public abstract class Bird {
    private String name;
    private String type;
    private double weight;
    private String color;

    public abstract void fly();

    public abstract void makeSound();

    public void eat() {
        System.out.println(this.name + " is eating food");
    }
}
