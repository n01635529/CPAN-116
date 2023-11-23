package assignment3;

public class carclass {
    private String make;
    private String model;
    private String year;
    private String color;
    private String status = "Stopped";
    private int speed = 0;
    private char gear;
    private static final int MAX_SPEED = 200;

    carclass(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.gear = 'p';
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

    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting color to: " + color);
    }

    public String getStatus() {
        return status;
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println("Starting the car");
        this.status = "started";

    }

    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public void stop() {
        System.out.println("Stopping the car");
        this.status = "stopped";

    }

    public void honk() {
        System.out.println("honk honk~~~");

    }

    public void accelerate(int acceleration) {
        if (status.equals("started")) {
            int newSpeed = speed + acceleration;
            if (newSpeed <= MAX_SPEED) {
                speed = newSpeed;
            } else {
                System.out.println("Cannot accelerate beyond MAX_SPEED");
            }
        } else {
            System.out.println("Please start the car");
        }
    }

    public void brake(int braking) {
        int newSpeed = speed - braking;
        if (newSpeed >= 0) {
            speed = newSpeed;
        } else {
            speed = 0;
        }
    }

    public void switchGear(char newGear) {
        gear = newGear;
    }

    public void displayState() {
        System.out.println("Current status: " + status);
        System.out.println("Current speed: " + speed);
        switch (gear) {
            case 'p':
                System.out.println("The car is in Park");
                break;
            case 'd':
                System.out.println("The car is in Drive");
                break;
            case 'n':
                System.out.println("The car is in Neutral");
                break;
            case 'r':
                System.out.println("The car is in Reverse");
                break;
        }
    }
}
