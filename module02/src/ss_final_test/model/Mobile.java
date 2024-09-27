package ss_final_test.model;

public abstract class Mobile {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String manufacturer;

    public Mobile(int id, String name, double price, int quantity, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return id + "," + name + "," + price + "," + quantity + "," + manufacturer;
    }

    public abstract String getAdditionalInfo();
}
