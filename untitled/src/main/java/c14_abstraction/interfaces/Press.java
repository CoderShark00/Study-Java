package c14_abstraction.interfaces;

public interface Press {
    // 5번 라인의 의미는 실제로는 public final String NAME = "button";과 동일
    String NAME = "button"; // 상수이기 때문에 선언과 동시에 초기화가 이루어져야 함.
                            // 마찬가지로 상수이기 때문에 대문자로 표기 함.

                            // 차이점으로는 상수임에도 불구하고 final이 붙지 않았다는 점
                            // interface에서는 자동으로 final이 표기된 것으로 간주됨.
//    private String name;    // 변수 선언 불가능
//    public Press();         // 생성자 선언 불가능
//    public default void pop(){} // 일반 메서드 선언 불가능
    void onPressed();
}
