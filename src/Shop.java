import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final String shopName;
    private static int shopCount = 0;

    Shop(String shopName) {
        this.shopName = shopName;
        shopCount++;
    }

    public String getShopName(){
        return this.shopName;

    }

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);

    }

    private void buy(String itemName){
        for (int i = 0; i < items.size(); i++){
            if (itemName.equals(items.get(i).getName())){
                items.remove(i);
                break;
            }
        }
    }
}