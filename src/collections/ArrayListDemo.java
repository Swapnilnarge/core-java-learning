package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(8);

        System.out.println(nums.indexOf(3));
        System.out.println(nums.get(1));

//        for (int n : nums) {
//            System.out.println(n * 2);
//        }
    }
}
