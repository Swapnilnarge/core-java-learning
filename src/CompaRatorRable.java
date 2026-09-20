import java.util.*;

class StudentComp {
    int age;
    String name;

    public StudentComp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentComp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CompaRatorRable {
    public static void main(String[] args) {

        Comparator<StudentComp> com = new Comparator<StudentComp>() {
            public int compare(StudentComp i, StudentComp j) {
                return i.age > j.age ? 1 : -1;
            }
        };

        List<StudentComp> studs = new ArrayList<>();
        studs.add(new StudentComp(22, "basics.Swapnil"));
        studs.add(new StudentComp(12, "Sonam"));
        studs.add(new StudentComp(34, "Kiran"));
        studs.add(new StudentComp(23, "Samy"));

        Collections.sort(studs , com);
//
        for (StudentComp st : studs) {
            System.out.println(st);
        }


    }
}
