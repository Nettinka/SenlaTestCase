package case_6;

public class Main6 {
    public static void main(String[] args) {

        Item one = new Item(5, 100, "1");
        Item two = new Item(2, 1000, "2");
        Item three = new Item(9, 50, "3");
        Item four = new Item(2, 50, "4");
        Item five = new Item(10, 100, "5");

        Vault vault = new Vault(12);

        Item[] items = {one, two, three, four, five};

        FindBetterVariant.findBetterVar(items, vault);

    }


}
