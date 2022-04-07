package nowcoder.course.chapter1;


import java.util.Arrays;

public class SelectSort {
    public void selectSortNew(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            // 一轮选择出一个最小的值
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) min = j;
            }
            Common.swap(array, i, min);
        }
    }


    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 2, 6, 10, 3, 14, 7, 3
        // N个数: N - 1轮，每一轮选择出来一个最小或最大的数
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            Common.swap(arr, i, minIndex);
        }
    }

    public static void selectionSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            Common.swap(arr, i, minIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        selectionSort1(new int[]{2, 6, 10, 3, 14, 7, 3});
    }
}
