package c15_casting.centralcontroll;

import java.util.Arrays;

public class CentralControl {
    
    // 필드 선언
    private Power[] deviceArray; // 필드를 배열로 선언


    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main에 각 클래스의 객체들을 하나씩 생성

    // 전자 제품들을 CentralControl의 필드인 배열에 추가해주는 메서드
    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) { // 실패를 -1로 리턴 보통 그렇게함
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName());
        // 객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력됨
        // 객체명.getClass().getSimpleName() -> 클래스 명만 출력

    }

    private int checkEmpty() {
        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void displayInfo() {
        System.out.println("=== 장치 정보 출력 ===");
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("슬롯 " + i + " : 비어 있음");
            } else {
                System.out.println("슬롯 " + i + " : " + deviceArray[i].getClass().getSimpleName());
            }
        }
        System.out.println("------------------------");
    }

    public void displayDevicesByToString(){
        System.out.println(Arrays.toString(deviceArray));
    }

    // 배열 내부에 있는 elements들의 전원을 전부 켜고, 끄는 메서드를 구현
    // 특정 배열 인덱스 내에 아무 객체가 없다면 .on()을 적용시켰을 경우 컴파일 에러가 나기 때문에 해당 부분을 감안한 코드를 작성
    public void powerOn() {
        for (Power device : deviceArray) {
            if (device == null) {
                continue; // 해당 반복문파트는 종료하고 다음 반복문 인덱스로 넘기겠다는 의미
            }
            device.on();
        }
    }

    // 전원버튼을 끄는 메서드 powerOff()를 구현
    public void powerOff() {
        for (Power device : deviceArray) {
            if (device == null) {
                continue;
            }
            device.off();
        }
    }

    // 배열 내부를 돌면서 요소의 고유 메서드들을 호출하는 예제 메서드
    public void performSpecificMethod(){
        for (Power device : deviceArray) {
            if(device instanceof Computer){
                // deviceArray 내부에 있는 요소라면 기본적으로 Power 인터페이스의 객체이거나 혹은
                // Power 인터페이스를 상속 받은 클래스의 객체에 해당합니다.
                // 이상의 코드는 배열 내부의 요소가 Computer 클래스의 인스턴스라면 다운 캐스팅을 실행
                Computer computer = (Computer) device; // 실행이 된다면 Computer 클래스로 다운캐스팅
                // 이제 객체명 computer는 Computer 클래스의 인스턴스이므로 Computer 클래스에 정의된
                // 고유 메서드를 실행 가능
                computer.compute();
            }else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick(); // LED 클래스에 changeColor() 메서드를 정의, 호출
            } else if ( device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            }else if (device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeMode();
            }
        }
    }
}
