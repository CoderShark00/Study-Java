package c16_object_classes;
/*
    모든 클래스는 Object 클래스를 상속 받는다. -> 우리가 정의한 것 말고 기존에 있는 class들을 의미한다.
 */
public class ObjectTest {
    private String name;
    private String address;

    // NoArgConstructor
    public ObjectTest() {

    }
    //AllArgsConstructor
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //Setter/Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //displayInfo() 정의
    // 실행 예
    // 이름 : 안근수
    // 주소 : 부산광역시 연제구
    public void displayInfo(){
        System.out.println("이름 : " + getName());
        System.out.println("주소 : " + getAddress());
    }

    //showInfo() 정의 sout말고 return형태
    public String showInfo(){
        return "이름 : " + getName() + "\n주소 : "  + getAddress();
    }


    // 즉 기본적으로 toString()이라는 메서드는 어떤 특정한 클래스의 인스턴스를 전부 다 String 형태로 바꿔주는 것을 의미하며, 이는
    // Object 클래스의 메서드를 Override 했음을 확인할 수 있음.
    @Override
    public String toString() {
        return "이름 :" + name + "\n주소 :" + address;
    }
}
