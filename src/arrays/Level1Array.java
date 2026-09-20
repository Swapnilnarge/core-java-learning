package arrays;//Print all nos
//public class arrays.Level1Array {
//    public static void main(String[] args) {
//        int nums[] = { 5, 8 , 2 , 9 , 1 };
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//
//    }
//}

// Print values of odd indices
//public class arrays.Level1Array {
//    public static void main(String[] args) {
//        int nums[] = { 5, 8 , 2 , 9 , 1 };
//        for(int i=0;i<nums.length;i++)
//            if(i%2!=0){
//                System.out.println(nums[i]);
//            }
//    }

//Print all even values iteslf
//public class arrays.Level1Array {
//    public static void main(String[] args) {
//        int nums[] = {  5, 8 , 2 , 9 , 1 };
//        int count = 0;
//        for(int i=0;i<nums.length;i++)
//            if(nums[i]%2==0){
//                count = count+1;
//            }
//        System.out.println(count);
//
//    }
//}
//Problem 4= Sum of all elements
//public class arrays.Level1Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        int sum = 0;
//        for(int i=0;i<nums.length;i++)
//        {
//            sum = sum + nums[i];
//
//         }
//      System.out.println(sum)
//



//}}
////
// problem 6 = Find the largest number
public class Level1Array {
    public static void main(String[] args) {
        int nums[] = {5, 8, 2, 9, 1};
        int largest = 5;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] < largest)
            {
            }
            else
                largest=nums[i];
        }
        System.out.println(largest);
    }}



