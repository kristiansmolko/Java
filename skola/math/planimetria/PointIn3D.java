package skola.math.planimetria;

public class PointIn3D extends Point{
    private int z;

    public PointIn3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public void print(){
        System.out.println("Pozicia je: " + getX() + ", " + getY() + ", " + z);
    }

    @Override
    public double getDistanceFromZero() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }


}
