package exceptions;

public class ExceptionSecond {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;
        String str = null;

        int[] nums = new int[5];
        try {
            j = 18 / i;
//            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("cannot divided by zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Put valid array index ");

        }
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("an exception has occured " + e);
        }
    }
}
