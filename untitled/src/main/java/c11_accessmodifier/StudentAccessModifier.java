package c11_accessmodifier;
/*
    접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용됨.

        종류 :
            1) public : 모든 클래스에서 접근할 수 있음
            2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
                자식 클래스에서 접근 가능
            3) default(package-private) : 접근 지정자를 명시하지 않으면
                default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
            4) private : 같은 클래스 내에서만 접근 가능

 */
public class StudentAccessModifier {
    private int studentCode;
    private String studentName;
    private double studentAvg;

    public StudentAccessModifier() {
    }

    public StudentAccessModifier(int studentCode, String studentName, double studentAvg) {
        this.studentCode = studentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getStudentAvg() {
        return studentAvg;
    }
    public void setStudentAvg(double studentAvg) {
        this.studentAvg = studentAvg;
    }

   public void showInfo(){
        System.out.println("Student Code: " + studentCode);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Avg: " + studentAvg);
   }

}
