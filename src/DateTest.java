import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String strData="2019-07-26 10:11:30.123";//定义日期时间的字符串
        String pat1="yyyy-MM-dd HH:mm:ss.SSS";//准备第一个模板，从字符串中提取日期数字
        String pat2="yyyy随意填MM-dd识别的:匹配字母的 HH点mm分ss秒SSS毫秒";//准备第二个模板，从字符串中提取日期数字


        //必须要根据模板实例化对象
        SimpleDateFormat sdf1=new SimpleDateFormat(pat1);//实例化模板对象
        SimpleDateFormat sdf2=new SimpleDateFormat(pat2);//实例化模板对象
        Date d=null;

        try {
            d=sdf1.parse(strData);//提取字符串中的日期
            System.out.println("字符串转为日期"+sdf1.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("日期转为字符串"+sdf1.format(d));
        System.out.println(sdf2.format(d));
    }



}
