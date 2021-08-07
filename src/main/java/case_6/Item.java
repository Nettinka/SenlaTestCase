package case_6;

public class Item {
    private Integer value;
    private Integer price;
    private String name;

    public Item(Integer value, Integer price, String name) {
        this.value = value;
        this.price = price;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
