package lab4;

public class cars {
    public static void main(String[] args) {

        carclass my_car = new carclass("Subaru", "Legacy", "2012", "Black");
        
        my_car.displayCarInfo();

        System.out.println(my_car.getStatus());
        System.out.println(my_car.getSpeed());

        my_car.start();
        System.out.println(my_car.getStatus());
        System.out.println(my_car.getSpeed());

        my_car.accelerate();
        System.out.println(my_car.getSpeed());

        my_car.brake();
        my_car.brake();
        my_car.stop();
        System.out.println(my_car.getStatus());
        System.out.println(my_car.getSpeed());
        my_car.honk();
    }

}
 