package basics;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;

        int x = 7;
        int y = 8;
        boolean r = a > b || x < y;
        boolean t = !r;
        System.out.println(t);
        System.out.println(r);


    }
}
//AND operator ['&']  It is used when for requirement both conditions  need to be true , if any one of them is false then it will be false .
// T  T --> T
// T  F --> F
// F  T --> F
// F  F --> F


//OR operator ['|']   It is used when for requirement even any one them conditions is true , then it will be true if both are true then its great it will be true obvously
// T  T --> T
// T  F --> T
// F  T --> T
// F  F --> F

//NOT operator ['!']
// T --> F
// F --> T
