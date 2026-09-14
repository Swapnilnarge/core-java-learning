class Calculator2 {
    public int add(int n1, int n2){
        return n1 + n2 ;
    }
    public double add(double n1, int n2){
        double x = n1 + n2;
        return x;
    }
    public int add(int n1, int n2 , int n3){
        return n1 + n2 + n3;

    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator2 calc = new Calculator2();
        int result = calc.add( 2,2,2);
        System.out.println(result);




    }
}



