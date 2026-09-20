package arrays;

public class MdArray {
    public static void main(String[] args) {
        int nums[][] = new int[2][3];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[1][0] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;
        for (int i = 0; i<nums.length; i++) {
            for (int j = 0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }
}
