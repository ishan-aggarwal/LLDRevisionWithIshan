package oop_1.problems.q1;

public class Student {
    int age;
    String name; // attribute/property/ data member

    void display() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old");
    }

    // parameter
    void sayHello(String name) {
        System.out.println(this.name + " says hello to " + name);
        // name data members says hello to name parameter
    }

    public static void main(String[] args) {
        Student student = new Student();
//        student.age = 38;
//        student.name = "Ishan";

        student.display();
        student.sayHello("Suraj");
    }
}