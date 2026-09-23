package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();

        for (int i = 1; i <= size; i++){
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int sums1 = nums.stream()
                .map(i -> {
                    try{
                     Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sums2 = nums.parallelStream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sums1 + " : " + sums2);
        System.out.println("Seq : " + (endSeq - startSeq));
        System.out.println("para : " +( endPara - startPara));
    }
}

