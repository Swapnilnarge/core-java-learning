package oop;

interface First {
    int age = 30;
    String name = "basics.Swapnil";

    void show();

    void config();
}

class Second implements First {

    public void show() {
        System.out.println("In new show");
    }

    public void config() {
        System.out.println("In new config");
    }
}

public class InterfacesFirstD {
    public static void main(String[] args) {
        First obj = new Second();
        obj.config();
        obj.show();
        System.out.println(First.age + " : " + First.name);
    }
}
