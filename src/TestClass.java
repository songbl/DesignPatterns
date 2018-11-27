import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

    /**
     * u4eoo-u9fa5是中文汉字
     *
     * @param args
     */
    public static void main(String[] args) {



        System.out.println("Hello World");
        int[] a = {4, 5, 9, 2, 7, 3, 8};
        int start = 0;
        int end = a.length - 1;
        //   sort(a, start, end);
        quickSort(a, start, end);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用

            if (start == end) {
                break;
            }
        }
        System.out.println(a[0]);
        //递归
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }

    /**
     * 快速排序方法，写法一
     *
     * @param sortNum 待排序的原始数组
     * @param L       比基准元素都要小的元素下标，左下标
     * @param R       比基准元素都要大的元素下标，右下标
     */
    private static void quickSort(int[] sortNum, int L, int R) {
        if (L >= R || sortNum.length <= 0) { // i大于或等于j，直接返回
            return;
        }
        int i = L; // i，比基数小的下标，左边
        int j = R; // j，比基数大的坐标，右边
        int key = sortNum[L]; // 基准元素，默认取数组的第一个元素
        // 让数组中的全部元素都比较
        while (true) {
            // j往前走
            while (j > i) {
                if (key > sortNum[j]) { // 找到第一个小于key的值A[j]，A[i]与A[j]交换
                    int temp = sortNum[j];
                    sortNum[j] = sortNum[i];
                    sortNum[i] = temp;
                    break;
                } else {
                    j--;
                }
            }
            // i往后走
            while (j > i) {
                if (key < sortNum[i]) { // 找到第一个大于key的A[i]，A[i]与A[j]交换
                    int temp = sortNum[j];
                    sortNum[j] = sortNum[i];
                    sortNum[i] = temp;             //%%%%计算出，这个位置的比基数小
                    break;
                } else {
                    i++;
                }
            }
            // 终结最外层while循环，表示一趟排序结束（全部元素都进行了比较）
            if (i == j) {
                break;
            }
        }


        // 继续排序基准元素的左边元素
        quickSort(sortNum, L, i - 1);


        // 继续排序基准元素的右边元素
        quickSort(sortNum, i + 1, R);


    }


}
