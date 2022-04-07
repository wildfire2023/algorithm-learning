package nowcoder.course.chapter1;

public class BubbleSortTest {

    public static void main(String[] args) {


    }

    public static void bubbleSort(int [] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) swap(arr, i, j);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
