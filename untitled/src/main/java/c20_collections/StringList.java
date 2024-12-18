package c20_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    컬렉션의 주요 특징
        1) 데이터의 저장 및 관리
            - 컬렉션은 데이터를 저장하고 조작하는데 사용
        2) 유연성과 재사용성
            - 다양한 자료구조를 지원하므로 목적에 맞게 사용
        3) 제네릭 지원
            - 타입 안정성을 제공하며 명시적 형변환이 필요없음
        4) 표준 인텊체이스 제공
            - 컬렉션은 공통 인터페이스를 통해 일관된 프로그래밍 방식 제공

    java collection 구조
        컬렉션 프레임워크는 크게 세 가지 우요 인터페이슬르 중심으로 구성됨.
        1. List
            - 중복 허용 , 순서가 있는 데이터 저장
            - 구현체 Arraylist linkedList Vector Stack
        2. set
            - 중복을 허용하지 않으며, 순서가 없는 데이터 저장
            - 구현체 Hashset linkedHashset TreeSet
        3. Map
            - 키와 값의 쌍으로 데이터 저장
            - 키는 중복을 허용하지 않지만 값은 중복 가능
            - 구현체 : HashMap, LinkedHashmap, TreeMap,. HashTable

    List - 데이터를 순차적으로 저장하며, 인덱스를 사용해 요소를 관리
         - 중복 허용

         구현체 :
            ArrayList : 내부적으로 배열을 사용하며, 조회 속도가 빠름
            LinkedList : 내부적으로 노드 구조를 사용하며, 삽입 / 삭제가 빠름


 */
public class StringList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        // List의 데이터 삽입
        list.add("java");
        list.add("python");
        list.add("C#");
        list.add("JavaScript");
        list.add("Kotlin");

        System.out.println(list);


        Scanner sc = new Scanner(System.in);

        System.out.println("검색할 요소를 입력하세요 >>>");
        String searchStr = sc.nextLine();
        boolean contatins = list.contains(searchStr);
        System.out.println(searchStr + " 포함 여부 : " + contatins);


        String removeStr = "C#";
        boolean removed = list.remove(removeStr);
        System.out.println(removeStr + "삭제 여부 : " + removed);
        System.out.println("삭제 후 전체 리스트 : " + list);

        String removeStr2 = "py";
        boolean removed2 = list.remove(removeStr2);
        System.out.println(removeStr2 + " 삭제 여부 : " + removed2);
        System.out.println("삭제 후 전체 리스트 : " + list);

        System.out.println(list.get(1));

        // List 정렬
        Collections.sort(list);
        System.out.println("정렬 이후 List : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("역순 정렬 list : " + list);

        for (String s : list) {
            System.out.println(s);
        }


    }
    }
