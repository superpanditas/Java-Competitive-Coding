import java.util.ArrayList;

public class Inventory {
    // Declare attributes
    private ArrayList<Item> items;

    // Declare constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for(Item item : items){
            System.out.println(item.toString());
        }
    }


}
