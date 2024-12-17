package c19_generic;
/*
    1. Products 클래스를 정의하고, 제네릭 타입 T를 사용하여 상품 정보를 저장할 수 있도록 하세요.
    2. ProductsController 클래스를 만들어 다양한 타입의 상품 정보를 저장하고 출력하는 코드를 작성하세요.
    3. 각 상품에 대해 이름과 정보를 저장하고 출력
 */
public class ProductsController {
    public static void main(String[] args) {
        Products<String> products1 = new Products<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        Products<Double> products2 = new Products<>("SmartPhone", 799.99);
        Products<Boolean> products3 = new Products<>("Available", true);
        System.out.println(products1);
        System.out.println(products2);
        System.out.println(products3);
    }
}
