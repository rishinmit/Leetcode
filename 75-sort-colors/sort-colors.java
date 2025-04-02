class Solution {
    public void sortColors(int[] nums) {
        int a = nums.length;
        for (int i = 0; i < a - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}