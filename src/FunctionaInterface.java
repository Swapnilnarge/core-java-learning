@FunctionalInterface
interface FunctionalInterfaceI1 {
    void show();
}

//class FunctionalInterfaceC1 implements FunctionalInterfaceI1 {
//    public void show(){
//        System.out.println("In show");
//    }
//}
public class FunctionaInterface {
    public static void main(String[] args) {

        FunctionalInterfaceI1 obj = new FunctionalInterfaceI1() {
            public void show() {
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
