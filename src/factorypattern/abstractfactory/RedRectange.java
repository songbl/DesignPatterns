package factorypattern.abstractfactory;

//具体颜色的Rectange实现
public class RedRectange extends Rectange{
    @Override
    public void draw() {
        System.out.println("绘制红色长方形");
    }
}
