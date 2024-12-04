package c10_getter_setter;
/*
    1. Setter / Getter의 필요성
        문제 상황
        클래스를 만든다고 가정해보겠습니다. 예를 들어, 사람(Person) 클래스를 만들면서
        이름(name), 나이(age) 등의 정보를 저장하기 위해 필드를 선언했습니다.

        class Person {
            String name;
            int age;
        }

        그리고 이를 PersonMain에서 객체를 생성했다고 가정하겠습니다.
        class PersonMain {
            public static void main(String[] args){
                Person person = new Person(); // 객체 생성
                person.name = "안근수"
                person.age = -10 //의도적으로 이상한 나이 설정했습니다.
          }
      }
      해당 코드를 확인했을 때 나이에 정상적이지 않은 값이 대입돼있습니다.
      이처럼 외부에서 직접 접근이 가능했을 때 이상한 값이 들어가더라도 통제할 수 있는
      방법이 없는 문제가 있습니다. -> 이를 해결하기 위한 방법 : Setter / Getter 개념
 */
public class GetterSetter {
}
