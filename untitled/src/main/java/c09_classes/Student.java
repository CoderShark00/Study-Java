package c09_classes;

/*
    학번, 이름, 점수(ABCDF) field 선언
    기본생성자
    학번을 매개변수로 하는 생성자
    점수를 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A등급
 */
public class Student {

    int num;
    String name;
    String grade;

    public Student() {
    }

    public Student(int num) {
        this.num = num;
    }

    public Student(String grade){
        this.grade = grade;
    }

    public Student(int num, String name, String grade) {
        this.num = num;
        this.name = name;
        this.grade = grade;
    }

    public void showInfo(){
        System.out.println("학번 : " + num + "\n이름 : " + name + "\n점수 : " + grade + "등급");
    }
}
