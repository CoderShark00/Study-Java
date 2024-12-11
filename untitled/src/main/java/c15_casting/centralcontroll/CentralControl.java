package c15_casting.centralcontroll;

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

    // 전원버튼을 끄는 메서드 powerOff()를 구현하세요.
    public void powerOff() {
        for (Power device : deviceArray) {
            if (device == null) {
                continue;
            }
            device.off();
        }
    }
}
