import classes.AreaVisitor;
import classes.Circle;
import classes.Element;
import classes.PerimeterVisitor;
import classes.Rectangle;
import classes.Visitor;

public class App {
    public static void main(String[] args) throws Exception {
        Element[] elements = new Element[] {
            new Circle(5),
            new Rectangle(2, 3)
        };

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        for (Element element : elements) {
            element.accept(areaVisitor);
            element.accept(perimeterVisitor);
        }
    }
}
