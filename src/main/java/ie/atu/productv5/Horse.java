package ie.atu.productv5;

public class Horse extends Animal{

    private String dam;
    private String sire;
    private double height;

    public Horse() {
        super();
        this.dam = dam;
        this.sire = sire;
        this.height = height;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "dam='" + dam + '\'' +
                ", sire='" + sire + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
