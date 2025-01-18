package oop_4.additionalproblems.q1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Car implements Comparable<Car> {
    private int Price;
    private int Speed;

    @Override
    public int compareTo(Car o) {
        return this.Price - o.Price;
//        return Integer.compare(this.Price, o.Price);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Car car = new Car();
        Field PriceField = car.getClass().getDeclaredField("Price");
        PriceField.setAccessible(true);
        PriceField.set(car, 10);

        Car other = new Car();
        PriceField.set(other, 20);

        // car.compareTo(other)
        Method compareToMethod = car.getClass().getDeclaredMethod("compareTo", Car.class);
        Object retVal = compareToMethod.invoke(car, other);
        int actualRetVal = (int) retVal;

        // assertEquals(-10, actualRetVal);
        System.out.println(actualRetVal);
    }
}