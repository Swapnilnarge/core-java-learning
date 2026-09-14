class AnonyDemo{
    public void show(){
        System.out.println("In a show");
    }
}

public class AnonymousInnDemo {
    public static void main(String[] args) {
        AnonyDemo obj = new AnonyDemo(){
            public void show(){
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}
