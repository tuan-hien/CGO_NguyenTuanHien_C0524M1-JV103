package ss_final_test.model;

public class BrandNew extends Mobile {
    private int warrantyDays;
    private String warrantyScope;

    public BrandNew(int id, String name, double price, int quantity, String manufacturer, int warrantyDays, String warrantyScope) {
        super(id, name, price, quantity, manufacturer);
        this.warrantyDays = warrantyDays;
        this.warrantyScope = warrantyScope;
    }

    // Getters and Setters

    @Override
    public String getAdditionalInfo() {
        return warrantyDays + "," + warrantyScope;
    }

    @Override
    public String toString() {
        return super.toString() + "," + getAdditionalInfo();
    }
}
