package oop_4.additionalproblems.q3;

public class VehicleRenting {
    public static void main(String[] args) {
        Rentable car = new Car("Toyota Camry");
        Rentable bicycle = new Bicycle("Mountain Bike");

        car.rent();
        bicycle.rent();
        car.returnItem();
        bicycle.returnItem();
    }
}