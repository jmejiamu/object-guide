
package objectguide;

/**
 *
 * @author JoseMejia62
 */
public class Main {

    public static void main(String[] args) {
        Car carOne = new Car();
        
        carOne.carBreak();
        carOne.carDrive();
        
        //Setter and Getter
        
        carOne.setColor("White");
        
        String carColor = carOne.getColor();
        
        System.out.println("Getter - " + carColor);
    }
    
}
