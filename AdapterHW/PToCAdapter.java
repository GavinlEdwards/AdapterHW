

public class PToCAdapter implements ICartesian{
    
    private IPolar polar;

    public PToCAdapter(IPolar polar) {
        this.polar = polar;
    }

    @Override
    public double getX() {
        return Math.cos(polar.getTheta())*polar.getR();
    }

    @Override
    public double getY() {
        return Math.sin(polar.getTheta())*polar.getR();
    }

    @Override
    public String toString() {
        return ("Adapted cartesian point with coordinates (" + this.getX() + "," + this.getY() + ")");
    }
}
