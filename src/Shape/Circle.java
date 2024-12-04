package Shape;
//Circle Class Implementing Shape Interface
public class Circle implements Shape {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }
    @Override
    public double calculateArea(){
        return  Math.PI * radious *radious;
    }
}
