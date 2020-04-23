package leetcode.easy;

public class RemoveElement {

    /**
     * 原地移除所有数值等于val
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int slot = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                swap(nums, i, slot--);
            }
        }
        return slot + 1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



    public static void main(String[] args) {
        System.out.println("test");
    }
}
