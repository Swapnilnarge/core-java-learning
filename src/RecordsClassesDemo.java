import java.util.Objects;

//class AlienRC {
//    private final int id;
//    private final String name;
//
//    public AlienRC(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        AlienRC alienRC = (AlienRC) o;
//        return id == alienRC.id && Objects.equals(name, alienRC.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "AlienRC{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

record  AlienRC(int id, String name) {
}

public class RecordsClassesDemo {
    public static void main(String[] args) {

        AlienRC a1 = new AlienRC(12, "basics.Swapnil");
        AlienRC a2 = new AlienRC(7, "Sonam");
        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
        System.out.println(a1);

    }
}
