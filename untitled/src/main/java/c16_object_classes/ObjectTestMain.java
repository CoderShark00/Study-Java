package c16_object_classes;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest("이승혁", "부산광역시 북구");
//        objectTest1.displayInfo();
//        System.out.println("--------------");
//        System.out.println(objectTest1.showInfo());

        // 객체 그 자체를 sout 시켰을 때
        System.out.println(objectTest1);
        // 이상과 같이 작성했을 때 현재(1212_2118기준)으로는 참조 자료형이기 떄문에 주소값이 나옴
        System.out.println(objectTest1.toString());
    }
}