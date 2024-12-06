package c11_accessmodifier;

import c09_classes.Student;

public class StudentAccessModifierMain {
    public static void main(String[] args) {

    StudentAccessModifier student1 = new StudentAccessModifier();

    student1.setStudentCode(1822978);
    student1.setStudentName("이승혁");
    student1.setStudentAvg(100.0);

    student1.showInfo();
        System.out.println(student1.getStudentName());
        System.out.println(student1.getStudentAvg());
        System.out.println(student1.getStudentCode());
    }
}
