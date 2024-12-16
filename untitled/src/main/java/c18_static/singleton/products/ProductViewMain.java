package c18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }
}
