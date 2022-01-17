package Module7;

public abstract class ShapePrinter implements ShapeName{
    private Shape shape;
    public ShapePrinter(Shape shape){
        this.shape = shape;
    }

    @Override
    public void printShapeName() {
        shape.printShapeName();
    }
}
