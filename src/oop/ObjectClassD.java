package oop;

import java.util.Objects;

class Laptop{
    String model;
    int cost;
    public boolean equals(Laptop obj2){
        return this.model.equals(obj2.model) && this.cost == obj2.cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return cost == laptop.cost && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, cost);
    }
}
public class ObjectClassD {
    public static void main(String[] args) {

     Laptop obj1 = new Laptop();
     obj1.model= "Acer";
     obj1.cost= 4;

     Laptop obj2 = new Laptop();
     obj2.model= "Acer";
     obj2.cost= 4;
     boolean result = obj1.equals(obj2);
     System.out.println(result);


    }
}
