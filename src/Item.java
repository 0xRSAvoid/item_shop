public class Item {
    private double price;
    private final String name;
    private int amount;

    public Item(double price, String name, int amount) {
        this.price = price;
        this.name = name;
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }

    public String toString(String name) {
        return "item(Name: " + name + ", Price: " + price + ", Amount: " + amount + ".)";
    }
}