package ss06_inheritance.exercise._2_Point2D;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public String toString() {
        return "Point2D{" + "x = " + x + ", y = " + y + "}";
    }
}
