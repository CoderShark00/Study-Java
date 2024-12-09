package c13_inheritance.product;

public class Item {
    private String name;
    private String category;

    public Item(String name, String category) {
        System.out.println("Item을 생성하였습니다.");
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
