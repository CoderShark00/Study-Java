package c18_static;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMain {

    private String name;

    // 필드를 set하고, 그 값을 get 할 수 있습니다.
    public static void main(String[] args) {
        System.out.println(Product.autoIncrement);
        Product product1 = new Product("p1");
        System.out.println(Product.autoIncrement);
        System.out.println("p1 " + product1.getSerialNumber());

        Product product2 = new Product("p2");
        System.out.println(Product.autoIncrement);
        System.out.println("p2 " + product2.getSerialNumber());

        ProductMain productMain = new ProductMain();
        /*
            productMain의 name에 "pn1"을 set하고, 콘솔창에 pm1이 나오도록 getter를 이용하세요
         */
        productMain.setName("pn1");
        System.out.println(productMain.getName());
    }
}
