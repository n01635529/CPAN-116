package cars.src;

public class cars {
    public static void main(String[] args) {

        carclass my_car = new carclass();
        my_car.make = "Subaru";
        my_car.model = "Legacy";
        my_car.year = "2012";
        my_car.color = "Black";
        
        System.out.println(my_car.make);
        System.out.println(my_car.model);
        System.out.println(my_car.year);
        System.out.println(my_car.color);

        System.out.println(my_car.status);
        System.out.println(my_car.speed);

        my_car.start();
        System.out.println(my_car.status);
        System.out.println(my_car.speed);

        my_car.accelerate();
        System.out.println(my_car.speed);

        my_car.brake();
        my_car.brake();
        System.out.println(my_car.status);
        System.out.println(my_car.speed);
        my_car.honk();
    }
    
}
 