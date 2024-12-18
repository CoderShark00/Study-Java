package c19_generic.wildcards;

import java.util.List;

/*

    1. 와일드 카드란?
        wildcards는 제네릭 클래스나 메서드에서 어떤 특정 타입이 아닌 어떤타입도 받을 수 있는 유연성을 제공
        하는 기능
        자바에서 와일드카드는 물음표로 표현되며 이를 통해 특정 타입을 고정하지 않고 타입의 범위를 제한하거나 열어둘 수 있다.

    2. 와읻르 카드의 필요 이유
        1) 다양한 타입의 데이터를 처리하기 위해 제네릭 클래스나 메서드는 특정 타입에 제한적일 수 있음.
            와일드 카드를 사용하면 여러 타입에 대해 유연성을 제시할 수 있음.
        2) 코드의 재사용성을 높이기 위해 와일드 카드를 사용하면 하나의 메서드로 다양한 타입의 데이터를 처리할 수 있어 코드의 중복을 줄이고 유지보수를 쉽게 함
    3. 와일드 카드의 종류
        1) 제한 없는 와일드카드
            -  특정 타입을 제한하지 않고 모든 타입을 허용
            - 주로 데이터를 읽기만 할 때 사용
        2) 상한 제한 와일드 카드 (?extends T)
            - 특정 타입 T와 그 하위 타입만 허용
            - 데이터를 읽을 때는 안전한 편, 하지만 쓰는 작업에는 제약이 있음.
        3) 하한 제한 와일드카드(? super T)
            - 특정 타입 T와 그 상위 타입만 허용
            - 데이터를 쓸 때는 안전한 편, 하지만 읽는 작업에는 제약이 있음.
    4. 와일드카드의 한계
        1) 쓰기 작업 제한
            상한 제한 와일드 카드 (? extends T(는 리스트에 데이터를 추가할 수 없음.
        2) 명확한 타입을 보장 x
            와일드카드는 구체적인 타입을 알 수 없기 때문에 컴파일러가 타입 안정성을 완전히
            보장하지 않음.
 */
public class WildcardExample01 {
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "cherry");
        List<Integer> integerList = List.of(1,2,3,4,5);

        printList(stringList);
        printList(integerList);
    }
}
