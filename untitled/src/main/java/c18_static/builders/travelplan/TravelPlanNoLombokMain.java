package c18_static.builders.travelplan;

public class TravelPlanNoLombokMain {
    public static void main(String[] args) {
        TravelPlanNoLombok travelPlanNoLombok1 = new TravelPlanNoLombok.Builder("런던","2025-01-01")
                .build();
        // 하지만 TravelPlanNoLombok 과 Builder에서 final로 지정한 속성 때문에 Builder의 생성자를 이용하는 경우 new와 .Builder(인수들)로 대문자
        // Builder를 사용해야 합니다.
        System.out.println(travelPlanNoLombok1);
    }
}
