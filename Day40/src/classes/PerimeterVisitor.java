package classes;
public class PerimeterVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getLength() + rectangle.getWidth());
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}