public class Cartesian implements ICartesian {

    private double x;
    private double y;

    public Cartesian() {
        
        
        this.x = 0;
        this.y = 0;


    }

    public Cartesian(double x, double y) {

        this.x = x;
        this.y = y;

    }

    @Override 
    public double getX() {
        return this.x;
    }

    @Override 
    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return ("Cartesian point with coordinates (" + this.getX() + "," + this.getY() + ")");
    }
}
