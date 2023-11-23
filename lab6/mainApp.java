package lab6;

public class mainApp {
    public static void main(String[] args) {
        deskPhone deskPhone = new deskPhone("Panasonic", "ModelX", "111-222-3333", "Office");
        cellPhone cellphone = new cellPhone("Apple", "iphone 14", "444-555-6666", 50);
        
        deskPhone.call("905-241-6655");

        cellphone.sendText("416-234-1353", "Hello how are you?");

        System.out.println("Battery level: " + cellphone.getBatteryLevel() + "%");

        cellphone.chargeBattery();
        System.out.println("Battery level after charge: " + cellphone.getBatteryLevel() + "%");
    }
}
