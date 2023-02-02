package ie.atu.productv4;

public class Music extends Product {

    private String artist;
    private String label;

    public Music(){
        super();
        artist = "";
        label = "";
        count++;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String author) {
        this.artist = author;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + "\nSigned to " + label;
    }

}
