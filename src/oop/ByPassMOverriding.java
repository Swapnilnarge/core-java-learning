package oop;

class Parent{
    void greet(){
        System.out.println("Hello from the oop.Parent!");

    }
}
class Child extends Parent{
    void greet(){
        super.greet();
    }
}
public class ByPassMOverriding {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.greet();
    }
}

