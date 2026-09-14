class AB{
    public int show(int n1, int n2) {
        return n1+n2;
    }
}
class AC extends AB{
    public int show(int n1 ,int n2 ) {
        return n1+n2+2;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        AC obj = new AC();
        int r1= obj.show(5,5);  
        System.out.println(r1);
    }
}
