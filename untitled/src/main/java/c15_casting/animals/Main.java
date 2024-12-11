package c15_casting.animals;
/*
    Animal
    Dog
    Main

    참조 자료형 캐스팅(Reference Type Casting)
        객체 지향 프로그래밍(OOP)에서 중요한 요소 중 하나입니다.

        1. 참조 자료형이란?
            자바에서의 자료형은 크게 두 가지로 구분됨.
                1) 기본 자료형(Primitive Types) : int, double, char 등
                2) 참조 자료형(Reference Types) : 객체를 참조하는 변수로 클래스나 인터페이스를 통해 생성된 객체

            참조 자료형 캐스팅 : 객체의 자료형을 반환하는 작업
                캐스팅 종류
                    1) 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환
                    2) 다운캐스팅 : 상위 클래스의 객체를 하위 클래스 타입으로 변환

                알아야 할 사항 : 연산자(Operator) instanceof
               ex) 1 + 1 = 2에서 +가 연산자에 해당

       2. 업캐스팅 - 암시적(Implicit)으로 이루어짐 -> 저희는 자동으로 바뀐다고 생각하면 됩니다.
       3. 다운캐스팅 - 명시적(explicit)으로 이루어짐 -> 반드시 개발자가 직접 바꿔줘야 한다고 생각해야 함.

       4. 업캐스팅과 다운 캐스팅의 활용
            캐스팅은 주로 다형성(Polymorphism)을 구현할 때 사용함. 상위 클래스의 타입으로 객체를 처리하면서도
            특정 상황에서는 하위 클래스의 고유 기능을 사용할 수 있음.
       5. 캐스팅의 장단점
            장점 :
                코드 유연성 : 업캐스팅을 통해 다양한 객체를 하나의 상위 클래스 타입으로 관리 가능
                다형성 구현 : 메서드 오버라이딩과 함께 사용하면 코드 재사용성을 높일 수 있음.

            단점 :
                다운 캐스팅의 위험성 : 잘못 다운 캐스팅을 하게 된다. 예를 들어 상위 클래스에 A와 하위 클래스에 B, C가 있다고 가정했을 때,
                                    B의 객체인 b를 A로 업캐스팅한 후, C로 다운 캐스팅하는 문제가 생길 수 있어 주의가 필요함.

                복잡성 증가 : 코드 가독성이 떨어질 수 있음 -> 이렇게 바꿨다가 저렇게 바꿨다가 하기 때문인데
                    특히 업캐스팅의 경우 암시적으로 일어나기 때문에 어디서 바뀌었는지 확인은 못하고 있다가
                    갑자기 다운캐스팅이 튀어나오는 경우에 초심자들이 코드를 읽는게 힘겨울 수 있다.


    instanceof 연산자 : Java에서 객체의 실제 타입을 검사하는 데 사용(어떤 클래스의 객체인지를 확인하는 용도)
        -> 주로 다운 캐스팅의 안전성을 확보하기 위해서 사용함.

        형식 :
            object(객체) instanceof ClassName(클래스명)  -> 1 + 1 생각

            object : 검사하려는 객체명
            ClassName : 객체가 검사될 클래스나 인터페이스

            반환값은 object가 ClassName의 인스턴스거나 ClassName의 하위 클래스의 인스턴스인 경우 true 반환,
            아니면 false 반환.


 */
public class Main {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog1 = new Dog();

        dog1.makeSound();

        dog1.fetch();

        Animal animal1 = dog1; // 업캐스팅 1번 방법
        animal1.makeSound();
        // animal1.fetch(); 안됨. 타입이 Animal로 선언돼있기 때문

        Animal animal2 = new Dog(); // 업캐스팅 2번 방법 -> 얘가 더 자주 씀
        // A a = new B();
        animal2.makeSound(); // Dog의 재정의된 makeSound()가 호출됨.

        Animal animal3 = new Animal();
        boolean result1 = (animal1 instanceof Animal);
        boolean result2 = (animal1 instanceof Dog);
        System.out.println(result1);
        System.out.println(result2);

        System.out.println("animal2 검증입니다.");
        boolean result3 = (animal2 instanceof Animal);
        boolean result4 = (animal2 instanceof Dog);
        System.out.println(result3);
        System.out.println(result4);

        System.out.println("animal3 검증입니다.");
        boolean result5 = (animal3 instanceof Animal);
        boolean result6 = (animal3 instanceof Dog);
        System.out.println(result5);
        System.out.println(result6);

        Dog dog2 = (Dog) animal2; // 다운 캐스팅의 경우 명시적으로 쓰여야 하기 때문에
                                 // 이전에 배운 형변환 방식인 '(클래스명)'을 사용해야 합니다.
                                 // 이전까지는 double pi = 3.14;
                                 // int three = (int) pi; 와 같은 방식으로 작성했지만,
                                 // 이제는 클래스와 객체 단위에서 생각할 필요가 있다.
        dog2.makeSound();
        dog2.fetch();

        Animal animal4 = new Dog();
//        Dog dog3 = (Dog)animal3;  // 컴파일 오류 : 애초에 Animal로 만든 것을 아무런 변형 없이 강제적으로 다운캐스팅을 시도했기 때문
//        dog3.makeSound();
//        dog3.fetch();

        System.out.println("animal4 검증 부분");
        if(animal4 instanceof Dog){
            Dog dog4 = (Dog)animal4;
            dog4.makeSound();
            dog4.fetch();
        }



    }
}
