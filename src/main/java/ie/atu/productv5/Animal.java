package ie.atu.productv5;

import java.text.NumberFormat;

public class Animal implements Productable{

    private String type;
    private String age;
    private String breed;
    private String price;

    public Animal() {
        super();
        type = "";
        age = "";
        breed = "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
