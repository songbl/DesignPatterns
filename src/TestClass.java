import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

    /**
     * u4eoo-u9fa5是中文汉字
     * @param args
     */
    public static void main(String[] args) {

        int count = 0;
        String strContent="123451bcde哈https://pay.sdo.com/Index.aspx?type=card尊敬的用户：https://pay.sdo.com/Index.aspx?type=card 地址:www.baidu.com地方";
        String regex = "(http:|https:)//[^[A-Za-z0-9\\._\\?%&+\\-=/#]]*";
        String regex2 = "(http://|ftp://|https://|www){0,1}[^\u4e00-\u9fa5\\s]*?\\.(com|net|cn|me|tw|fr)[^\u4e00-\u9fa5\\s]*";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(strContent);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            System.out.println("Match number "+count);
            System.out.println("start(): "+matcher.start());
            System.out.println("end(): "+matcher.end());
            System.out.println(matcher.group());
            String urlStr=matcher.group();
            StringBuffer replace = new StringBuffer();
            replace.append(urlStr);
            matcher.appendReplacement(result, replace.toString());
        }
        matcher.appendTail(result);
//        System.out.println(result);
    }

}
