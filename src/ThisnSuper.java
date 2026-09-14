class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n)
    {
        System.out.println("In A int");
    }
}
class B extends A{
    public B()
    {
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In B int");
    }
}
public class ThisnSuper {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
