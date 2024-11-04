package week3;


class Vehicle {
    public void display() {
        System.out.println("This is a vehicle.");
    }
}

// Derived class Car
class Car extends Vehicle {

    @Override
    public void display() {
        System.out.println("This is a car.");
    }
}
class Bike extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a bike.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myVehicle.display();
        myCar.display();
        myBike.display();
    }
}

