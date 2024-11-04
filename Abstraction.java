package week3;

abstract class Animal {

    public abstract void sound();
    public void sleep() {
        System.out.println("This animal sleeps.");
    }
}

interface Flyable {
    void fly();
}

class Bird extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("The bird chirps.");
    }

    @Override
    public void fly() {
        System.out.println("The bird flies.");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Bird myBird = new Bird();

        myBird.sound();
        myBird.sleep();
        myBird.fly();
    }
}

