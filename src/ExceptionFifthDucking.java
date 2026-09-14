class  ExceptionFifth {
    public void show() throws ClassNotFoundException{

        Class.forName("ExceptionFifth");
    }

}

public class ExceptionFifthDucking {
    public static void main(String[] args) {

        ExceptionFifth obj = new ExceptionFifth();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class is missing: " + e);
        }

    }
}
