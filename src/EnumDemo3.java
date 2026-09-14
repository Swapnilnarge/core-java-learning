enum Laptop3 {
    Macbook(2000),XPS(2200) , Acer(1800) , ThinkPad(1900);
    private int price;

    Laptop3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumDemo3 {
    public static void main(String[] args) {
        Laptop3 lap = Laptop3.Macbook;
        for(Laptop3 ss : Laptop3.values()){
            System.out.println(ss + " : " + ss.getPrice());
        }

        EnumDemo3 obj = new EnumDemo3();

    }
}
