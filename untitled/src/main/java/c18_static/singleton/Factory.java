package c18_static.singleton;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 선언
    private String factoryName;

    // 생성자 정의 부분 필요 x

    public SmartPhone produceSmartPhone(){
        System.out.println(factoryName + "에서 스마트폰을 생산");

        String model="갤럭시S";
        String serial = null;

        Samsung samsung = Samsung.getInstance();



        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, samsung.createSerialNumber(model));
        return smartPhone;
    }
}
