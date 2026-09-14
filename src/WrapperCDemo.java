public class WrapperCDemo {
    public static void main(String[] args) {
        int num = 7;
        // Boxing terminology .
        Integer num1 = num; //Autoboxing(Implicit). Integer num1 = new Integer(num) -> boxing(explicite)manual

        //Unboxing terminology  .
        int num2 = num1; // Auto-unboxing(Implicit). //int num2 = num1.intValue();-> Unboxing(Explicit)Manually typed
        System.out.println(num2);


        String str = "12";  
        int num3 = Integer.parseInt("12");
        System.out.println(num3 * 2);
    }
}
