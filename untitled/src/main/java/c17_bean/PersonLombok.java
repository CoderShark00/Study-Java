package c17_bean;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class PersonLombok {
    private final String name;
    private int age;

    // 에너테이션 사용하게되면 충돌이 일어날수있어서 생성자를 쓰든 에너테이션을 쓰든 해야함.
}
