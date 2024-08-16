package ss04_class_and_object.exercise._3_Fan;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public static final int Slow = 1;
    public static final int Medium = 2;
    public static final int Fast = 3;


    //Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan() {
    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = Slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getIsOn() {
        return this.on;
    }

    public void setIsOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
           return "Speed: " + this.speed + ", On: " + this.on + ", Radius: " + this.radius + ", Color: " + this.color;
        } else {
            return "Color: " + this.color + ", Radius: " + this.radius;
        }
    }
}