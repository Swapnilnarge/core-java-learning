class Human2 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age, Human2 obj) {
//        Human2 obj1 = obj;
//        obj1.age = age;
        if(age < 0){
            System.out.println("Age is invalid");
            return;
        }
        else
            System.out.println("Age is valid");
        this.age = age;
    }

    public void setName(String name, Human2 obj) {
//        Human2 obj1 = obj;
//        obj1.name = name;
        this.name = name;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Human2 obj = new Human2();
        obj.setAge(22, obj);
        obj.setName("basics.Swapnil", obj);

        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
