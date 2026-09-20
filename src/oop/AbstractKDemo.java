package oop;

abstract class Car {   // Abstract class
    public abstract void drive();

    public void play() {
        System.out.println("Music is playing");
    }
}

class Wagonr extends Car { //Concrete class
    public void show2() {
        System.out.println("In a wagonr show");
    }

    public void drive() {
        System.out.println("driving wagonr");
    }
}

public class AbstractKDemo {
    public static void main(String[] args) {
        Car obj = new Wagonr();
        obj.drive();
        obj.play();

    }
}
