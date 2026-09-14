//print all elements.
//public class Array {
//    public static void main(String[] args) {
//        int nums[] = { 5, 4, 8 , 9};
//
//        for (int i=0; i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//  }
//
//}
//Print the array without using loop
//public class Array {
//    public static void main(String[] args) {
//        int nums[] = { 2 , 4 , 6 , 8 };
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
//    }
//}
//Modify one element
//public class Array {
//    public static void main(String[] args) {
//        int nums[] = { 2 , 4 , 6 , 8 , 10 };
//        nums[3] = 0;
////        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);
// }
//}
//print only the even index values .

//public class Array {
//    public static void main(String[] args) {
//        int nums[] = {2, 4, 6, 8, 10};
//
//        for (int i=0;i<nums.length;i++)
//            if(i%2==0)
//              System.out.println(nums[i]);
//    }
//}
//print the array backword
public class Array {
    public static void main(String[] args) {

        int nums[] = new int[5];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 8;
        nums[4] = 20;
        for (int i= (nums.length-1); i>=0 ; i--){
            System.out.println(nums[i]);
        }
    }
}
