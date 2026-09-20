package oop;

class A{
    public A(){
        System.out.println("In oop.A");
    }
    public A(int n)
    {
        System.out.println("In oop.A int");
    }
}
class B extends A{
    public B()
    {
        System.out.println("In oop.B");
    }
    public B(int n){
        this();
        System.out.println("In oop.B int");
    }
}
public class ThisnSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
