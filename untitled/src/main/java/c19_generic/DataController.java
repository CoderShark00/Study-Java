package c19_generic;

import java.util.Date;


// 1. T(Type)) : 일반적으로 클래스 타입을 나타낼 때 사용
// 2, E(Element) : 컬렉션 요소를 나타낼떄 사
/*
    3. K : 맵의 key를 나타낼 때 사용
    4. V : 맵의 값 또는 제네릭 타입의 반환값으로 사용
 */
// 드디어 제네릭
public class DataController{
    public static void main(String[] args) {
        //Date 클래스를 import 해서 now 객체 생성 -> 기본 생성자를 통해

        Date now = new Date();
        // <> 안에 앞으로 들어갈 타입을 미리 명시(제약) 할 수 있음
        ResponseData<String> responseData1= new ResponseData<>("날짜 저장 성공", now.toString());
        // Data 클래스의 객체인 now와 거기에 딸려있는 인스턴스 메서드 toString()
        // ResponseData 클래스를 확인해보면 T data로 정의한 필드가 있는데, 이를
        // main 단계에서 ResponseData<String>으로 정의함으로써 data가 될 수 있는 자료형은 String만 가능하게 됨.
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("번호 저장 성공", 10);
        System.out.println(responseData2);

        ResponseData<Date> responseData3 = new ResponseData<>("날짜 객체 저장 성공", now);
        System.out.println(responseData3);

    }
}
