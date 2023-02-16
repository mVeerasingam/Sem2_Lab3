package ie.atu.productv5;

public class Dog extends Animal{
    private boolean vaccination;
    private String shedding;
    private boolean  neutered;

    public Dog() {
        super();
        this.vaccination = vaccination;
        this.shedding = shedding;
        this.neutered = neutered;
    }

    public boolean getVaccination() {
        return vaccination;
    }

    public void setVaccination(boolean vaccination) {
        this.vaccination = vaccination;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccination='" + vaccination + '\'' +
                ", shedding='" + shedding + '\'' +
                ", neutered='" + neutered + '\'' +
                '}';
    }
}
