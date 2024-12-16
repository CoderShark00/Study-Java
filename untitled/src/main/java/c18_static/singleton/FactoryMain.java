package c18_static.singleton;
/*
    싱글톤 패턴(Singleton Pattern)
        : 소프트웨어 '디자인 패턴' 중 하나로 메인 클래스가 하나의 인스턴스만 갖도록 보장하고
        그 인스턴스에 접근할 수 있는 전역적인 접근법을 제공한느 패턴, 예를 들며, 데이터베이스 연결과 같은
        리소스는 프로그램 전제에서 하나의 인스턴스만 사용해야 할 때가 많기 때문에 싱글톤 패턴이 유용함
    싱글톤 패턴의 특징
        1. 하나의 인스턴스만 존재 : 하나의 인스턴스만 생성되고 ,이 인스턴스는 프로그램이 실행되는 동안 유지
        2. 전역 접근법 : 싱글톤 인스턴스 '정정(static) 메서드'를 통하여 어디서든 접근할 수 있음.
        3. 인스턴스의 생명 주기 관리 : 클래스 자체가 인스턴스 생성을 관리하므로, 다른 객체들이 직접
            인스턴스를 생성하거나 폐기 할수 있음



 */
public class FactoryMain {
    public static void main(String[] args) {


        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        // smartPhone1의 경우 SmarPhone 클래스의 객체인데, 왜 sout(smartPhone1)했는데
        // 주솟값이 아니라 필드가 튀어나오죠?
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);
    }
}
