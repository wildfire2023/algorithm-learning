package leetcode.easy;

public class SearchInsert {


    /**
     * 给定一个排序数组以及一个待查找目标值，如果该值在数组中出现，返回其下标；
     * 否则返回其按顺序插入数组的下标
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        // O(N)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * O(log(n))
     * @param nums
     * @param target
     * @return
     */
//    public int searchInsertBinary(int[] nums, int target) {
//
//    }

    public static void main(String[] args) {
    }

}
