package c09_classes;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productName = "LG제이패드";
        product1.productNum = 147258;


        Product product2 = new Product(987654);
        product2.productName = "GS충전기";


        Product product3 = new Product("피치패드");
        product3.productNum = 159357;

        Product product4 = new Product(4862, "블루미플립6");

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();
    }
}
