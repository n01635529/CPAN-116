package lab4;

public class carclass {
    private String make;
    private String model;
    private String year;
    private String color;
    private String status = "Stopped";
    private int speed = 0;

    carclass(String make, String model, String year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;

    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getStatus() {
        return status;
    }

    public int getSpeed() {
        return speed;
    }
    public void start(){
        System.out.println("Starting the car");
        this.status = "started";
        
    }
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
    
    public void stop(){
        System.out.println("Stopping the car");
        this.status = "stopped";
        
    }
    
    public void honk(){
        System.out.println("honk honk~~~");
       
    }

    public void accelerate(){
        this.speed += 20;
    }
    
    public void brake(){
        this.speed -= 10;
    }
}
 