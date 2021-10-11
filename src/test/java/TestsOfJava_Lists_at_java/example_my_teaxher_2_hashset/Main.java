package TestsOfJava_Lists_at_java.example_my_teaxher_2_hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /**
     * <p>|</p>
     * <p>|</p>
     * <p>|</p>
     * <p>|</p>
     * <p>|</p>
     * <p>|</p>
     * <p>\/</p>
     */
    public static void main(String[] args) {
        Set<Student> student = new HashSet<>();
        student.add(new Student(1, "erfan"));
        student.add(new Student(1,"erfan"));

//**********************************************************
        for(Student student1: student){
            System.out.println(student1.getName());
        }
//        for(Student student1: student){
//            System.out.println(student1.setId(5));
//        }

//***********************************************************
    }
}
