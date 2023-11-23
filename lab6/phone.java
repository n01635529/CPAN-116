package lab6;

public class phone {
    private String brand;
    private String model;
    private String phoneNumber;

    public phone(String brand, String model, String phoneNumber) {
        this.brand = brand;
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

    public void call(String number) {
        System.out.println("Calling " + number + "...");
    }

    public void receiveCall(String caller) {
        System.out.println("Receiving a call from " + caller);
    }
}
