// Static variable demo code
class Mobile {
    String Brand;
    int price;
    static String name;
}

public class StaticDemo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.Brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";
        Mobile.name = "Screentouch Phone";
        System.out.println(obj1.Brand + " : " + obj1.price + " : " + Mobile.name);
        System.out.println(obj2.Brand + " : " + obj2.price + " : " + Mobile.name);
    }
}
