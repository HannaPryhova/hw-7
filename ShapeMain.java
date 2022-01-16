package Module7;

public class ShapeMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];

        shapes[0] = new Quad();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Rhombus();
        shapes[4] = new Square();
        shapes[5] = new Triangle();

        for (Shape s: shapes) {
              s.printShapeName();
        }
    }

}
