package ie.atu.productv5;

public class TV extends Product {
    private String tv;
    private String brand;

    public TV(){
        super();
        tv = "";
        brand = "";
        count++;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + tv + "\nManufactured by " + brand;
    }
}
