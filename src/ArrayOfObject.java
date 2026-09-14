class Student {
    int rollNo;
    String Name;
    int marks;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo=21;
        s1.Name="Swapnil";
        s1.marks= 72;

        Student s2 = new Student();
        s2.rollNo=22;
        s2.Name="vishal";
        s2.marks=75;

        Student s3 = new Student();
        s3.rollNo=23;
        s3.Name="Ajay";
        s3.marks=85;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].rollNo+"  :  "+students[i].Name);
//        }
        for(Student stud : students)
        {
            System.out.println(stud.Name+" : "+stud.marks);  
        }

    }
}
