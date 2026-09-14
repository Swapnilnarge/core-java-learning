// **Static Method demo code**??
// class Mobile2{
//    String brand;
//    int price;
//    static String name;
//
//    public void show() {
//        System.out.println(brand + " : " + price + " : " + name);
//    }
//    public static void show1(Mobile2 obj){
//        System.out.println(obj.brand + " : " + obj.price + " : " + name);
//    }
//
//}
//public class StaticMDemo {
//    public static void main(String[] args) {
//        Mobile2 obj1 = new Mobile2();
//        obj1.brand="Apple";
//        obj1.price=8000;
//        obj1.name="Smartphone";
//
//        Mobile2 obj2 = new Mobile2();
//        obj2.brand="Samsung";
//        obj2.price=10000;
//        obj2.name="smartphone";
//        Mobile2.name="Phone";
//        obj1.show();
//        obj2.show();
//        Mobile2.show1(obj2);
//        Mobile2.show1(obj1);
//    }
//}

//Static Block Demo code
class Mobile2 {
    String brand;
    int price;
    static String name;

    static {
        name = "Smartphone";
        System.out.println(" In a static");
    }

    public Mobile2() {
        brand = "";
        price = 4000;
    }

    public static void show(Mobile2 obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticMDemo {
    static void main(String[] args) throws ClassNotFoundException {

//        Class.forName("Mobile2");
        Mobile2 obj1= new Mobile2();
        obj1.brand="Apple";
        obj1.price=80000;

        Mobile2 obj2= new Mobile2();
        obj2.brand="Samsung";

        Mobile2.show(obj1);
        Mobile2.show(obj2);
    }
}

