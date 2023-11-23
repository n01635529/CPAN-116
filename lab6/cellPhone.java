package lab6;

public class cellPhone extends phone{
    private int batteryLevel;

    public cellPhone (String brand, String model, String phoneNumber, int batteryLevel) {
        super(brand, model, phoneNumber);
        this.batteryLevel = batteryLevel;

    }

    public void receiveText(String sender, String message) {
        System.out.println("Message from " + sender + ": " + message);
    }

    public void sendText(String recipient, String message) {
        System.out.println("Sent a text to " + recipient + ": " + message);
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void chargeBattery() {
        System.out.println("Charging phone");
        batteryLevel += 10;
    }
}
