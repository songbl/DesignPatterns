package factorypattern.abstractfactory;

//BlueShapeFactory（他所代表的是兰色形状这一族）
public class BlueShapeFactory implements ShapeFactory {
    @Override
    public Shape getCircle() {
        return new BlueCircle();
    }

    @Override
    public Shape getRectange() {
        return new BlueRectange();
    }
}
