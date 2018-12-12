package factorypattern.abstractfactory;

//RedShapeFactory（他所代表的是红色形状这一族）
//这个工厂生产的就是整个红色的这一个族
public class RedShapeFactory implements ShapeFactory {
    @Override
    public Shape getCircle() {
        return new RedCircle();
    }

    @Override
    public Shape getRectange() {
        return new RedRectange();
    }
}
