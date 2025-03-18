public class Polar implements IPolar {

    private double r;
    private double theta;

    public Polar() {
        
        this.r = 0;
        this.theta = 0;

    }

    public Polar(double r, double theta) {

        this.r = r;
        this.theta = theta;

    }

    @Override 
    public double getR() {
        return this.r;
    }

    @Override 
    public double getTheta() {
        return this.theta;
    }

    @Override
    public String toString() {
        return ("Polar point with coordinates (" + this.getR() + "," + this.getTheta() + ")");
    }
}
