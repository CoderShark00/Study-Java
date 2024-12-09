package c13_inheritance.product;

public class Product extends Item {

    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);
        System.out.println("Product가 생성되었습니다.");
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Product 이름 변경 : " + name);
        super.setName(name);
    }

    @Override
    public String getCategory() {

        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        System.out.println("Product 카테고리 변경 : " + category);
        super.setCategory(category);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayInfo(){
        System.out.println("제품명 : " + getName() + "\n카테고리 : " + getCategory());
        System.out.println("가격 : " + getPrice() + "\n재고 : " + getStock());
    }


}
