package buliderpattern;

public class TestBuilder {
    public static void main (String args[]){
        ParamBuilder params = new ParamBuilder.Builder()  //创建内部类对象
                .url("wwww.baidu.com")              //对象.方法
                .username("song")
                .password("123")
                .builder();                         //最后调用builder()，创建外部类，对外展示得类对象，


        System.out.println(    params.toString());
    }

}
