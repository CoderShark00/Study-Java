package c19_generic;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;

    // 제네릭을 적용하기 위해선느 클래스명 옆에 <T>
}
