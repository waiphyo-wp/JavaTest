package OOP.CircleVsCylinder;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        // c.setColor("Green");
        c.setRadius(2.0);

        System.out.println(c.getArea());

        System.out.println(c.toString());
    }
}
