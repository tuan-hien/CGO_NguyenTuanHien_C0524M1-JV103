package ss_case_study.model;

public class Laptop extends Product {
    private String processor;

    public Laptop() {}

    public Laptop(String id, String name, String brand, double price, String processor) {
        super(id, name, price, brand);
        this.processor = processor;
    }

    public String getProcessor() {return processor;}
    public void setProcessor(String processor) {this.processor = processor;}

    @Override
    public String toString() {
        return super.toString() + " is laptop equipped with processor " + processor + ".";
    }
}
