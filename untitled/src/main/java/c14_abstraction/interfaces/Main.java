package c14_abstraction.interfaces;
/*
    인터페이스(interface)
        인터페이스는 자바에서 클래스가 구현해야 하는 '메서드'들의 집합을 정의하는 일종의 규약(protocol)
        인터페이스는 메서드의 시그니처(메서드 이름, 리턴 타입, 매개변수 목록)만을 포함하며, 메서드의 실제
        구현은 포함하지 않음 -> 마치 추상메서드와 비슷해 보인다.
        다중 상속을 지원 -> 이를 통해 클래스가 여러 인터페이스를 구현할 수 있음
            일반 클래스의 경우 하나의 클래스만 상속 가능

    특징
        1. 추상 메서드 : 인터페이스 내의 모든 메서드는 기본적으로 추상 메서드 -> 즉, 메서드의 정의만 있고
            구현은 없다. 인터페이스는 100% 추상 메서드
        2. 상수 : 인터페이스 내에서 선언된 변수는 '자동으로' public static final 상수로 취급됨.
        3. 다중상속 : 클래스는 여러 인터페이스를 구현할 수 있다.

    추상 클래스와의 공통점
        - 모두 추상 메서드를 포함할 수 있고, 서브 클래스 / 구현 클래스에서 이를 구현해야 한다.

    추상 클래스와의 차이점
        - 추상 클래스
            1. 부분 구현 허용 : 추상 클래스는 추상 메서드 뿐만 아니라 일반 메서드(구현이 포함된 메서드)도
                포함 할 수 있다.
            2. 상태 저장 가능 : 추상 클래스는 인스턴스 변수(상태)를 가질 수 있다.
            3. 단일 상속 : 클래스는 하나의 추상 클래스만 상속 받을 수 있다.
            4. 생성자 : 추상 클래슨느 생성자를 가질 수 있다.
            5. 다양한 접근 제어자(Access Modifier) : 추상 클래스와 메서드와 변수는 다양한 접근 제어가
                (public, protected, private)를 가질 수 있다.

        - 인터페이스
            1. 완전한 추상화 : 인터페이스는 기본적으로 모든 메서드가 추상 메서드이다.
                Java 8 이후에, default, static 메서드를 사용할 수 있긴 합니다.
            2. 인터페이스는 인스턴스 변수(필드 중 객체마다 값이 달라지는 변수)를 가질 수 없고, 상수만 선언 가능
            3. 다중 상속 : 클래스는 여러 인터페이스를 구현할 수 있다.
            4. 생성자 없음 : 인터페이슨느 생성자를 가질 수 없다. -> 일단 멤버 변수(인스턴스 변수)에서 없기
                때문에 생성자 생성 불가능 -> 객체마다 다른 값을 가질 수 없다는 의미가 됩니다.
            5. 자동 public : 인터페이스의 메서드들은 자동으로 public이며, 메서드 선언에 접근 제어자를 명시할 필요가 없다.
                Java 8 이후에, default, static 메서드를 사용할 수 있긴 합니다.
 */
public class Main {
    public static void main(String[] args) {
        /*
            AllArgsConstructor이므로 오류발생 채워줘야함.

            RemoteController의 객체를 생성했는데, 그 객체 이름이 remoteController
            클래스명 객체명 = new 생성자(argument1, argument2, ---)
            클래스명 객체명 = new 클래스명(new 클래스2명, new 클래스3명, new 클래스4명)

            이상의 경우 new클래스2명(), new 클래스3명()를 통해 객체 생성은 이미 완료가 됨
            다만, 여태까지와의 차이점은 new 클래스2명(), new 클래스3명()에 해당하는 객체명이 없을 뿐입니다.
         */
        RemoteController remoteController =  new RemoteController(new ChannelDownButton(), new PowerButton(), new ChannelUpButton(), new VolumeUpButton(), new VolumeDownButton());



        remoteController.onPressedPowerButton();
        remoteController.onPressedPowerButton();

        remoteController.channelDown();
        remoteController.onPressedChannelDownButton();
        remoteController.channelUp();
        remoteController.onPressedChannelUpButton();

        remoteController.volumeDown();
        remoteController.onPressedVolumeDownButton();
        remoteController.volumeUp();
        remoteController.onPressedVolumeUpButton();
    }
}
/*
    1. VolumeDownButton, VolumeUpButton 클래스를 만드시오
    2. RemoteController 필드에 위에서 만든 클래스들의 객체 추가
    3. RemoteController AllArgsConstructor 수정
    4. VolumeDownButon, VolumeUpButton에 있는 메서드들을 RemoteController에 재구현
    5. Main으로 넘어와 볼륨한칸 내리기, 계속 내리기, 한칸올리기, 계속 올리기
 */
