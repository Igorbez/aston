public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red", "Black");
        Rectangle rectangle = new Rectangle(3, 4, "Blue", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Orange");

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Shape Info:");
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Fill Color: " + ((Colorable) shape).getFillColor());
        System.out.println("Border Color: " + ((Colorable) shape).getBorderColor());
        System.out.println();
    }
}
