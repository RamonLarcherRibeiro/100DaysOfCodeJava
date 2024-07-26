package classes;
public class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Area of Rectangle: " + area);
    }
}

