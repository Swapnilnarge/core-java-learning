class SwapnilException extends Exception {
    public SwapnilException(String str) {
        super(str);
    }
}
public class ExceptionCustomFourth {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;

            if (j == 0) {
                throw new SwapnilException("I cannot accept zero value");
            }

        }
        catch (SwapnilException e) {
            j = 18 /1;
            System.out.println("Thats default value " + e);
        }
        catch (Exception e) {
            System.out.println("An exception has occured " + e);
        }
        System.out.println(j);


    }
}
