class Human3 {
    private int age;
    private String name;

    public Human3() {  // Default constructor
        this.age = 33;
        this.name = "John";
    }

    public Human3(int age, String name) { //parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class DeParaConst {
    public static void main(String[] args) {
        Human3 obj = new Human3();
        Human3 obj1 = new Human3(22, "Swapnil");

        System.out.println(obj.getAge() + " : " + obj.getName());
        System.out.println(obj1.getAge() + " : " + obj1.getName());
    }
}
