public class Computer extends Item {
    private int gbRam;

    public Computer(double price, String name, int amount, int gbRam) {
        super(price, name, amount);
        this.gbRam = gbRam;

    }

    @Override
    public String toString() {
        return "Computer(Name: " + getName() + ", Price: " + getPrice() + ", Amount: " + getAmount() + ", Ram: " + gbRam + ".)";
    }

    public void setRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getRam() {
        return this.gbRam;
    }
}