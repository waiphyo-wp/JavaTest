package OOP.CircleVsCylinder;

public class Circle {
    private double radius;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return ( radius * radius ) * Math.PI; 
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle : radius = " + radius + " color=" + color;
    }

}
