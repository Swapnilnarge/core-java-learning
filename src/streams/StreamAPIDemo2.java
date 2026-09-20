package streams;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6, 2, 9, 5);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n * 2);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println(result);




//        nums.forEach(n -> System.out.println(n));

    }
}
