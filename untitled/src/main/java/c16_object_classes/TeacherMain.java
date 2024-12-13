package c16_object_classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
        // teacher1 객체의 클래스 정보 얻기
//        Class tClass = teacher1.getClass();
//
//        System.out.println(tClass);
//        // class c16_object_classes_Teacher -> 결과값
//        System.out.println(tClass.getSimpleName());
//
//        System.out.println(teacher1);

        // 클래스의 모든 필드 정보 출력 하는 반복문
        for (Field field : teacher1.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
            System.out.println(field.getType().getSimpleName());
            System.out.println();
        }

        System.out.println("-------------------------------------");

        // 클래스의 모든 메서드 정보를 출력하는 반복문
        for (Method method : teacher1.getClass().getDeclaredMethods()) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getSimpleName());
            System.out.println();
        }

        System.out.println(Arrays.toString(teacher1.getClass().getDeclaredFields()));
        System.out.println();
        System.out.println(Arrays.toString(teacher1.getClass().getDeclaredMethods()));

        System.out.println("-----------------------------------");
        System.out.println(teacher1.getClass() == teacher2.getClass()); // 각 객체가 동일한 클래스에서 생성된 객체인지 확인
        System.out.println(teacher1 instanceof Teacher); // true

        c16_object_classes.equals_test.Teacher teacher3  = new c16_object_classes.equals_test.Teacher("안근수", "코리아아이티");
        System.out.println(teacher3 instanceof c16_object_classes.equals_test.Teacher);

        System.out.println(teacher1.getClass()==Teacher.class);
        System.out.println(teacher2.getClass()==Teacher.class);
        System.out.println(teacher3.getClass()== c16_object_classes.equals_test.Teacher.class);

    }
}
