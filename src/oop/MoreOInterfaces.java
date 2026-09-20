package oop;

// class - class = extends
// class - interface = implements
// interface - interface = extends
interface AN {
    int age =22 ;//Final and Static
    String name = "John";
    void move();
    void drop();
}

interface BC {
    void run();
}

interface CD extends BC{

}

class MoreInter implements AN, CD {
    public void drop() {
        System.out.println("dropping");
    }
    public void move() {
        System.out.println("moving ");
    }
    public void run() {
        System.out.println("runnning");
    }
}

public class MoreOInterfaces {
    private MoreOInterfaces() {
    }
        public static void main(String[] args) {
        AN obj = new MoreInter();
        CD obj1 = new MoreInter();
        obj1.run();
        obj.drop();
        obj.move();
    }
}
