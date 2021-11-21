package nowcoder.course.chapter1;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 4, 10, 4, 3, 2, 9, 12};
        bubbleSortNew(arr);
        System.out.println(arr);
    }


    /**
     * 冒泡排序复述
     * @param arr
     */
    public static void bubbleSortNew(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) Common.swap(arr, i, j);
            }
        }
    }


    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) Common.swap(arr, i, i + 1);
            }
        }
    }

    public static void bubbleSort1(int[] arr) {
        // 参数校验
        if (arr == null || arr.length < 2) {
            return;
        }
        //  6,8,2,4,10
        // 冒泡规则: N个数, 比较N - 1轮, 每一轮选出最大的数
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    // for test
    public static int[] generateRandomArray(int size, int value) {
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random()) - (int) (value * Math.random());
        }
        return arr;
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
