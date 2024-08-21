package ss06_inheritance.exercise._2_Point2D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        // hoặc super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return super.toString() + "\b, z = " + z + "}";
        // hoặc return "Point3D{"+ "x = " + getX() + ", " + "y = " + getY() + ", " + "z = " + z + '}';
    }
}
