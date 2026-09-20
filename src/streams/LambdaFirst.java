package streams;

@FunctionalInterface
interface LambdaInterFirst {
    public int add(int i, int a);
}

public class LambdaFirst {
    static void main(String[] args) {

//        streams.LambdaInterFirst obj = () -> System.out.println("In a show");
//        obj.show();


        LambdaInterFirst obj = (int i, int a) -> i + a;
        int result = obj.add(5, 5);
        System.out.println(result);
    }
}
