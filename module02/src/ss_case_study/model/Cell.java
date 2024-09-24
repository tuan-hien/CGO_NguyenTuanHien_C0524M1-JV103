package ss_case_study.model;

public class Cell extends Product{
    private int capacity;

    public Cell() {}

    public Cell(String id, String name, String brand, double price, int capacity) {
        super(id, name, price, brand);
        this.capacity = capacity;
    }

    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}

    @Override
    public String toString() {
        return super.toString() + " is cell equipped with " + capacity + "Gb capacity.";
    }
}
