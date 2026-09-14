import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapFilterReduceSORT {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 6, 2, 9, 5);

        Predicate<Integer> pr = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };

        Function<Integer, Integer> fn = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return 0;
            }
        };


        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}
