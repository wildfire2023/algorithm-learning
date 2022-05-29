package leetcode.easy;

public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = nums1.length - 1;
        int left = m - 1;
        int right = n - 1;
        while (left >= 0 && right >= 0) {
            if (nums1[left] >= nums2[right]) {
                nums1[idx--] = nums1[left--];
            } else {
                nums1[idx--] = nums2[right--];
            }
        }
        while (right >= 0) {
            nums1[idx--] = nums2[right--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1, 3, nums2, 3);
    }


}
