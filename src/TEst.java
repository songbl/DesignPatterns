public class TEst {
    public static void main(String args[]){
        String [] attrs = {"one", "two", "three", "four",};
        /* 开始遍历 */
        for (String i : attrs) {
            System.out.println("简单的遍历"+i);
        }
        for (int i= 0;i<attrs.length;i++){
            System.out.println("复杂遍历序列号"+i+"="+attrs[i]);
        }
    }
}
