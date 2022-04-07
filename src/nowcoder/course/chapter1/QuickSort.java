package nowcoder.course.chapter1;


import java.util.Arrays;

public class QuickSort {


//    public static int[] partition(int[] arr, int L, int R) {
//        if (L > R) {
//            return new int[]{-1, -1};
//        }
//        if (L == R) return new int[]{L, R};
//        int less = L - 1;
//        int more = R;
//        int index = L;
//
//    }

    /**
     *  <= 区  > 区
     *  less)5 3 2 1 6 9 8 4
     * @param arr
     * @param L
     * @param R
     * @return
     */
    public static int partition1(int[] arr, int L, int R) {
        int p = arr[R];
        int less = L - 1;
        for (int i = L; i <= R; i++) {
            if (arr[i] <= p) {
                Common.swap(arr, i, ++less);
            }
        }
        return less;
    }

    public static int partition3(int[] arr, int L, int R) {
        int lessEqual = L - 1;
        for (int i = L; i < R;) {
            if (arr[i] <= arr[R]) {
                Common.swap(arr, i++, ++lessEqual);
            } else {
                Common.swap(arr, i, --R);
            }
        }
        return lessEqual;
    }

    /**
     * 小于区  等于区  大于区
     * less)5 3 2 1 6 9 8 (4
     * @param arr
     * @param L
     * @param R
     * @return
     */
    public static int[] partition2(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        for (int i = L; i < more;) {
            if (arr[i] < arr[R]) {
                Common.swap(arr, i++, ++less);
            } else if (arr[i] > arr[R]) {
                Common.swap(arr, i, --more);
            } else if (arr[i] == arr[R]) {
                i++;
            }
        }
        Common.swap(arr, more, R);
        // 返回等于区域
        return new int[] {less + 1, more};
    }

    public static void quickSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort1Recur(arr, 0, arr.length - 1);
    }

    /**
     * 快排：划分函数+递归整体复杂度nlog(n)
     * @param arr
     * @param L
     * @param R
     */
    public static void quickSort1Recur(int[] arr, int L, int R) {
        if (L >= R) return;
        int[] equal = partition2(arr, L, R);
        quickSort1Recur(arr, L, equal[0] - 1);
        quickSort1Recur(arr, equal[1] + 1, R);
    }





    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 6, 9, 8, 4};
//        int index = partition1(arr, 0, arr.length - 1);
//        System.out.println(index);
//        quickSort1(arr);
        partition3(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
