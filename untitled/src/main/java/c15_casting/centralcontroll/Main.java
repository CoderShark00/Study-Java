package c15_casting.centralcontroll;
/*
    centralcontroll 패키지 생성
    Power 인터페이스
    Main 클래스
 */
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Speaker speaker1 = new Speaker();
        Tv tv1 = new Tv();
        Mouse mouse1 = new Mouse();

        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer1);
        centralControl.addDevice(led1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(tv1);
        centralControl.addDevice(mouse1);

        // 현재 코드를 작성한 바에 따르면 객체를 centeralControll에 추가했을 때만 콘솔창에 어떤 클래스의 객체가 추가되었는지
        // 확인하는 것만 가능한 상태

        // centralControll.displayInfo()를 실행할때 현재 배열에 들어가있는 요소들을 출력할 수 있도록 작성

        centralControl.displayInfo();
//        centralControl.displayDevicesByToString();
        //주소값이 String으로 바뀌어서 콘솔에 출력하게 된다.

        //배열의 각 요소들을 켜보세요 -> 그래서 메서드들을 확인해서 그 구조가 어떻게 되는지 확인해야한다.
        centralControl.powerOn();
        System.out.println("------------------");
        centralControl.powerOff();

        // Mouse 클래스를 정의하고, Main에서 객체 mouse1을 생성
        // 배열에 집어넣으시고
        // 배열 내의 전체 객체들을 켜고 끄세요



        centralControl.powerOn();
        System.out.println("------------------");
        centralControl.powerOff();


        mouse1.leftClick(); // mouse1과 같은 객체를 배열 내부가 아니라 외부에서 그대로 고유 메서드를 실행 가능

        System.out.println("---------------------");
        centralControl.performSpecificMethod();
    }
}
