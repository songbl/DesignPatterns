package factorypattern.abstractfactory;

public class TestDemo {
    public static void main(String[] args) {

        /**
         * 生产一个  产品族  的东西 。红色的产品族
         * 这个产品族 是 红色的圆圈，红色的椭圆
         */
        ShapeFactory redShapeFactory = new RedShapeFactory();
        Shape circle = redShapeFactory.getCircle();
        circle.draw();
        Shape rectangle = redShapeFactory.getRectange();
        rectangle.draw();

        /**
         * 生产一个  产品族  的东西 。蓝色的产品族
         * 增加一个产品等级结构没有什么问题，再创建一个工厂，生产就行
         * 但是如果增加一个新的产品，不可以，产品族发送变化，抽象的工厂就需要改变，所有的工厂方法都需要改变，不可以。
         */
        ShapeFactory buleShapeFactory = new BlueShapeFactory();
        Shape circle1 = buleShapeFactory.getCircle();
        circle1.draw();
        Shape rectangle1 = buleShapeFactory.getRectange();
        rectangle1.draw();
        /**
         *  可以扩展
         */
//        ShapeFactory greenShapeFactory = new GreenShapeFactory();
//        Shape greenCircle = greenShapeFactory.getCircle();
//        greenCircle.draw();
    }
}