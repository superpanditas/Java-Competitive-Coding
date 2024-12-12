public class Fruit extends Item {
    // Declare attribute
    private String type;

    // Declare constructor
    public Fruit(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }

    @Override
    public String toString(){
        return "name: " + getName() + ", quantity: " + getQuantity() + ", type: " + type;
    }

}
