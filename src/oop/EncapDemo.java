package oop;

class Human {
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
public class EncapDemo {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(-25);
        obj1.setName("basics.Swapnil");
        System.out.println(obj1.getAge() + " : " + obj1.getName());
    }
}
