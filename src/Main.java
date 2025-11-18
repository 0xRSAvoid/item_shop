public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Noam's Shop");
        Item milk = new Item(5.67, "Milk", 1);
        Item eggs = new Item(16.90, "Eggs", 32);
        Item chocolate = new Item(9.90, "Yishay's milk", 1);
        Item temu = new Computer(4555, "digger bigger", 1, 500);

        shop.addItem(milk);
        shop.addItem(eggs);
        shop.addItem(chocolate);
        shop.addItem(temu);
    }
}