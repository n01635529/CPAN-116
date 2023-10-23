package lab5;

public class cars {
    public static void main(String[] args) {

        carclass my_car = new carclass("Subaru", "Legacy", "2012", "Black");
        
        my_car.displayCarInfo();

        my_car.setColor("Blue");
        System.out.println("Color: " + my_car.getColor());

        System.out.println("Status: " + my_car.getStatus());
        System.out.println("Speed: " + my_car.getSpeed());



        my_car.start();
        System.out.println("Status: " + my_car.getStatus());
        System.out.println("Speed: " + my_car.getSpeed());

        my_car.accelerate(40);
        System.out.println("Speed: " + my_car.getSpeed());

        my_car.brake(40);
        my_car.stop();
        System.out.println("Status: " + my_car.getStatus());
        System.out.println("Speed: " + my_car.getSpeed());
        my_car.honk();
    }

}
 