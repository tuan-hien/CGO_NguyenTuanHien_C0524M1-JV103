package ss07_abstract.practice._1_Shape;

abstract public class Shape {
    protected int x, y;

    protected Shape(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    abstract public void draw();

    abstract public void erase();

    public void moveTo(int _x, int _y) {
        erase();
        this.x = _x;
        this.y = _y;
        draw();
    }
}
