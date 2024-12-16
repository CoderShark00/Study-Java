package c18_static.singleton;

import lombok.Getter;

public class Samsung {
    // 필드 정의
    @Getter
    private String company;
    private int serialNumber;

    // 여기서부터 싱글턴 패턴을 작성합니다
    // 1. 스태틱 변수 정의 -> 보통 싱글톤 만들 때 객체명을 instance로 쓰는편
    private static Samsung instance = null;

    //2 . 기본생성자 정의
    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20240000;
    }

    public static Samsung getInstance(){
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }


}
