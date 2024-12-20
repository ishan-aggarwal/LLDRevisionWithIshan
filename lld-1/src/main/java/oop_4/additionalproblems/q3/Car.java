package oop_4.additionalproblems.q3;

public class Car implements Rentable {
    String carModel;
    public boolean isRented;

    public Car(String carModel) {
        this.carModel = carModel;
        this.isRented = false;
    }

    // TODO: Complete the rent method
    @Override
    public void rent() {
        if (!isRented) {
            System.out.println("Renting car: " + carModel);
            isRented = true;
        } else {
            System.out.println("Car " + carModel + " is already rented");
        }
    }

    @Override
    public void returnItem() {
        if (isRented) {
            System.out.println("Returning car: " + carModel);
            isRented = false;
        } else {
            System.out.println("Car " + carModel + " is not rented");
        }
    }
}