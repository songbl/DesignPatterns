package factorypattern.abstractfactory;

public class RedCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("绘制红色的圆");
    }
}
