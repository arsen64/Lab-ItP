public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5),
            new Square(3),
            new Ellipse(5, 3)
        };

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
