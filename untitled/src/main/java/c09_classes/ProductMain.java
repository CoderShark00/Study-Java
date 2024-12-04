package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();    -> 이제는 new 클래스명()에서 '클래스명()'이 생성자라는 사실을 우리는 압니다
        // 1번 지시 사항 - 기본 생성자 사용
        Product product1 = new Product();
        // 기본 생성자를 사용했다는 말은 객체 생성 시 속성에 아무런 값을 대입하지 않았다는 의미
        // 추가적인 코드 작성을 통해 속성에 값을 대입해야만 함.
        // 예시를 위한 product1.showInfo() 메서드 확인
        product1.productName = "LG제이패드";
        product1.productNum = 147258;


        Product product2 = new Product(987654);
        product2.productName = "GS충전기";


        Product product3 = new Product("피치패드");
        product3.productNum = 159357;

        Product product4 = new Product(4862, "블루미플립6");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
