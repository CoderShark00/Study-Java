package c16_object_classes;


public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("안근수", 20241213);
        Student student2 = new Student("이승혁", 1822978);


        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student1));
        System.out.println(student1.equals(student2));
    }
}
