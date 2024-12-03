package c09_classes;

public class Student02 {
    int studentCode;
    String name;
    double score;


    public Student02(int studentCode) {
        this.studentCode = studentCode;
    }

    public Student02(String name) {
        this.name = name;
    }

    public Student02(double score) {
        this.score = score;
    }

    public Student02(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public Student02(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    public Student02() {
    }
}
