package c19_generic.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample03 {
    public static void addNumbers(List<? super Integer> list){
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);

        System.out.println(numbers);

        // List<? super Integer>는 Integer와 그 상위 타입만 허용
        // 데이터를 추가하는 것은 안전하지만, 읽을 때는 항상 Object 타입으로 반환됨.


        // wildcards 패키지 내에 wildcard_practice 패키지 생성
    }
}
