//Inheritance and multi level inheritance code
class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b){
        return a - b;
    }
}
class AdvanceCalc extends Calc{

    public int mult(int a, int b)
    {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
class GalacticCalc extends AdvanceCalc{
    public double power(double n1, double n2){
        return Math.pow(n1,n2);
    }
}
public class InheritanceD {
    public static void main(String[] args) {
        GalacticCalc obj1 = new GalacticCalc();
        int r1 = obj1.add(5,5);
        int r2 = obj1.sub(5,5);
        int r3 = obj1.mult(5,5);
        int r4 = obj1.div(5,5);
        double r5 = obj1.power(5,3);

        System.out.println(r1 + " "+r2 + " "+ r3 + " "+ r4);
        System.out.println(r5);
    }
}



