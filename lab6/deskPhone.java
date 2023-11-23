package lab6;

public class deskPhone extends phone {
    private String location;

    public deskPhone(String brand, String model, String phoneNumber, String location) {
        super(brand, model, phoneNumber);
        this.location = location;
    }
}
