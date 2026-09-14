import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums  = Arrays.asList(2,3, 5, 6 ,9, 8);


        nums.forEach(n -> System.out.println(n));
//        int sum = 0;
//        for (int n : nums) {
//            if (n%2==0 ){
//                n = n*2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
    }
}
