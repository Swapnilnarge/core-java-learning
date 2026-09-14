import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 4, 2, 7, 8, 3, 6);

        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(con);


    }
}
