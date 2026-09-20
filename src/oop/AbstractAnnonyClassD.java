package oop;

abstract class AbstractAnnony {
    public abstract void show();
    public abstract void config();
}
public class AbstractAnnonyClassD {
    public static void main(String[] args) {
        AbstractAnnony obj = new AbstractAnnony()
        {
            public void show() {
                System.out.println("In new show");
            }
            public void config() {
                System.out.println("In new Config");
            }
        };
        obj.show();
        obj.config();
    }
}
