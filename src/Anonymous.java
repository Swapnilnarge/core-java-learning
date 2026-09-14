class Ann{

    public Ann(){
        System.out.println("in object created");
    }
    public void show(){
        System.out.println("In a show");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        new Ann().show();  // Anonymous object . It can be used once only after its creation
    }
}



