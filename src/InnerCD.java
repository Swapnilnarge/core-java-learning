class Outer {
    int age ;

    public void show() {
        System.out.println("In the show");
    }

    class Inner {
        public void config() {
            System.out.println(age);
        }
    }
}

public class InnerCD {
    public static void main(String[] args) {
        Outer obj = new Outer();
//        obj.age =  22 ;

        Outer.Inner obj1 = obj.new Inner();
        Outer.Inner obj2 = obj.new Inner();
        obj1.config();
        obj2.config();
        System.out.println(obj.age);


    }
}