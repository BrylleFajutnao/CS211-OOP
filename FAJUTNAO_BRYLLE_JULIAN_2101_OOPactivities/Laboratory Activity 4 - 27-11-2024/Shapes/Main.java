public class Main {
    public static void main(String[] args) {
        Square square = new Square(55);
        Rectangle rectangle = new Rectangle(64, 68);
        Triangle triangle = new Triangle(73, 76, 79);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}

