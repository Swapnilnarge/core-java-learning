package oop;

class Up {
    public void show1() {
        System.out.println("In show oop.Up");
    }
}

class Down extends Up {
    public void show2() {
        System.out.println("In show oop.Down");
    }
}

public class UpDownCastD {
    public static void main(String[] args) {
        Object obj = new Up();
        System.out.println(obj.hashCode());


        Up obj1 = (Up) obj;
        obj1.show1();
    }
}





