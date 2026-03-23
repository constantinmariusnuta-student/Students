package students;

import java.lang.Object;
import java.util.*;

public class Application {
    static void main() {
        Student s1 = new Student(112, "Ioan", "Popa", "TI21/1");
        Student s2 = new Student(112, "Maria", "Oprea", "TI21/1");
        Student s3 = new Student(120, "Alis", "Popa", "TI21/2");
        Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1");
        Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2");
        List<Student> students = new ArrayList();
        System.out.println(students.size());
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students.size());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        afiseaza(students);
        System.out.println();
    }

    private static void afiseaza(List<Student> students) {
        for (Student s : students)
            System.out.println(s);
    }
   /* System.out.println(new Student(null,"Ioan","Popa","TI_21/1"),lista));*/

}
