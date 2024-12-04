package Shape;

public class ShapeTest {
    //Main Class to Demonstrate Usage
    public static void main(String[] args) {
      //  Shape c1 = new Circle(5);
        Circle  c1 = new Circle(5);
        double area = c1.calculateArea();
        System.out.println("The area of the circle is:" + area);
    }
}
