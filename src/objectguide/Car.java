package objectguide;

/**
 *
 * @author JoseMejia62
 */
public class Car {
    
    // - Instance Variables
    private String model;
    private int year;
    private String color;

    // - Default Constructor
    public Car() {    }

    // Constructor with parameters
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    public void carBreak(){
        System.out.println("Break");
    }
    
    public void carDrive(){
        System.out.println("Drive");
    }
}
