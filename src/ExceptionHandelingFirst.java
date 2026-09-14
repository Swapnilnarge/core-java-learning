public class ExceptionHandelingFirst {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try
        {
            j = 24/i;
        }
        catch (Exception e){
            System.out.println("Exception has occured");
        }
        System.out.println(j + " working ");
    }
}
