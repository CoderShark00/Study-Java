package c20_collections;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("강준석", 20240002));
        students.add(new Student("강준석", 20240002));
        students.add(new Student("강준석", 20240002));
        students.add(new Student("강준석", 20240002));
    }
}
