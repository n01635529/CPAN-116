package cars.src;

public class carclass {
    String make;
    String model;
    String year;
    String color;
    String status = "stopped";
    int speed = 0;
    
    public void start(){
        System.out.println("Starting the car");
        this.status = "started";
        
    }
    
    public void stop(){
        System.out.println("Stopping the car");
        this.status = "stopped";
        
    }
    
    public void honk(){
        System.out.println("honk honk~~~");
       
    }

    public void accelerate(){
        this.speed = + 20;
    }
    
    public void brake(){
        this.speed = - 10;
    }
}
 