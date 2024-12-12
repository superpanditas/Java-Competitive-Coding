public class Item {
    private String name;
    private int quantity;

    // Declare constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    // Declare methods
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    @Override
    public String toString(){
        return "name: " + name + ", quantity: " + quantity;
    }

}
