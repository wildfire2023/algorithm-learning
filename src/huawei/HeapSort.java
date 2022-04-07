package huawei;

public class HeapSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        buildMaxHeap(arr);
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, 0, i);
        }
    }

    private static void buildMaxHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            maxHeapify(arr, i, arr.length);
        }
    }

    private static void maxHeapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest, n);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
