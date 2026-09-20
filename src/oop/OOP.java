package oop;

class Calculator {
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        System.out.println("This is the addition of two numbers");
        return r;

    }
}
public class OOP {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);




    }
}              