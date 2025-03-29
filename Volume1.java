// Volume class (subclass extending Circle)
public class Volume1 extends Circle1 {
    private double height;
    private double volume;

    // Constructor
    public Volume1(double radius, double height) {
        super(radius);  // Call superclass constructor to set the radius
        this.height = height;
        this.volume = 0;  // Initialize volume to 0
    }

    // Calculate method to compute volume
    public double calculate() {
        volume = Math.PI * radius * radius * height;
        return volume;
    }

    // Display method to print volume
    public void display() {
        super.display();  // Calls the display method of the superclass (Circle)
        System.out.println("Volume of the Cylinder: " + volume);
    }

    // Main method for testing
    public static void main(String[] args) {
        Volume1 cylinder = new Volume1(5.0, 10.0);  // Create a Volume object with radius 5 and height 10
        cylinder.calculate();  // Calculate the volume
        cylinder.display();   // Display the circle radius and cylinder volume
    }
}