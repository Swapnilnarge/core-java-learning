//Final keyword = can be used with varible , method and class
class Calc2{
      public void show(){
          System.out.println("By basics.Swapnil");
      }
      public void show(int a, int b){
          System.out.println(a+b);
      }
}
class AdvnCalc extends Calc2 {
    public void show() {
        System.out.println("By John");
    }
}
public class FinalD {
    static void main(String[] args) {

        AdvnCalc obj = new AdvnCalc();
        obj.show();
        obj.show(7,3);
    }
}


