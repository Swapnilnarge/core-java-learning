import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(12);
        nums.add(5);
        nums.add(15);
        nums.add(1);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
//        for (int n : nums){
//            System.out.println(n);
//        }
    }
}
