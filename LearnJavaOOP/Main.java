//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // Initialize an object from Class Inventory
        Inventory inventory = new Inventory();
        // Initialize objects from Class Item
        Item item01 = new Item("generic item", 200);
        Fruit fruit = new Fruit("fuji", "apple", 50);
        Weapon weapon = new Weapon("gun", 30, 100, "maller");

        inventory.addItem(item01);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
    }
}