import java.util.ArrayList;
import java.util.List;

public class TEst {
    public static void main(String args[]){

        Dog dog = new Dog("狗一号");
        dog.eat();











        String [] attrs = {"one", "two", "three", "four",};
        List<String> testList = new ArrayList<>();
        testList.add("甲");
        testList.add("已");
        testList.add("丙");
        testList.add("丁");

        /* 开始遍历 */
        for (String i : attrs) {
            System.out.println("简单的遍历"+i);
        }
        for (int i= 0;i<attrs.length;i++){
            System.out.println("复杂遍历序列号"+i+"="+attrs[i]);
        }


        for (String i : testList) {
            System.out.println("简单的遍历集合"+i);
        }
        for (int i= 0;i<testList.size();i++){
            System.out.println("复杂遍历集合"+i+"="+testList.get(i));
        }
    }
}
