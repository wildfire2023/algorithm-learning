package nowcoder.course.chapter1;

import java.util.Arrays;

public class InsertSort {

    /**
     * 插入排序
     * 5, 2, 3, 1, 9, 10, 7
     * 算法：从第二个数开始比较，比前面的数大或者小，就插入到前面
     * @param arr
     */
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 有序组和待排序组
        for (int i = 1; i < arr.length; i++) {// 待排序组
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Common.swap(arr, j, j+1);
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        insertSort(new int[] {5, 2, 3,3, 1, 9, 10, 7});
    }
}
