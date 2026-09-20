package arrays;//Find the smallest no in array
//public class arrays.Level2Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        int smallest = 5;
//        for(int i=0; i<nums.length; i++)
//        {
//            if(nums[i]<smallest)
//                smallest = nums[i];
//        }
//        System.out.println(smallest);
//    }
//}

//problem = 2 Calculate the average
//public class arrays.Level2Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        int sum = 0;
//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            sum = sum + nums[i];
//            count++;
//        }
//        int avg = sum/nums.length;
//
//        System.out.println(avg);
//    }
//}
//Count odd numbers
//public class arrays.Level2Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        int count = 0;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]%2!=0)
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//Find the  index of the largest no
//

//Reverse print the arrays.Array
//public class arrays.Level2Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        for(int i=(nums.length-1);i>=0;i--)
//        {
//            System.out.print(nums[i]+" ");
//
//        }
//    }
//}
// Largest and smallest in one loop
//public class arrays.Level2Array {
//    public static void main(String[] args) {
//        int nums[] = {5, 8, 2, 9, 1};
//        int largest = nums[0];
//        int smallest = nums[0];
//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]>largest)
//            {
//                largest=nums[i];
//            }
//            if(nums[i]<smallest)
//            {
//                smallest=nums[i];
//            }
//        }
//        System.out.println(largest);
//        System.out.println(smallest);
//    }
//}

//Linear search
public class Level2Array {
    public static void main(String[] args) {
        int nums[] = {5, 8, 2, 9, 1};
        int target=1;
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            if (target == nums[i])
            {
                index = i;
            }
        }
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.println("Found at index "+index);
    }
}

