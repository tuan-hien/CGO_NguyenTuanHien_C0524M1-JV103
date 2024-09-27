package ss_final_test.model;

public class Imported extends Mobile {
    private String country;
    private String status;

    public Imported(int id, String name, double price, int quantity, String manufacturer, String country, String status) {
        super(id, name, price, quantity, manufacturer);
        this.country = country;
        this.status = status;
    }

    // Getters and Setters

    @Override
    public String getAdditionalInfo() {
        return country + "," + status;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getAdditionalInfo();
    }
}
