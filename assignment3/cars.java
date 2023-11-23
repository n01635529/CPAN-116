package assignment3;

public class cars {
    public static void main(String[] args) {
        carclass myCar = new carclass("Subaru", "Legacy", "2012", "Black");

        myCar.setColor("Blue");
        myCar.displayCarInfo();
        System.out.println("Color: " + myCar.getColor());

        myCar.displayState();
        myCar.start();
        myCar.switchGear('d');
        myCar.accelerate(50);
        myCar.displayState();
        myCar.brake(30);
        myCar.switchGear('r');
        myCar.accelerate(20);
        myCar.displayState();
        myCar.brake(20);
        myCar.switchGear('p');
        myCar.stop();
        myCar.displayState();
        myCar.honk();
    }
}
