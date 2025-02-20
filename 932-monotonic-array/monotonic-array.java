class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, d = true;
        int a = nums.length;

        for (int i = 1; i < a; i++) {
            if (nums[i] > nums[i - 1]) d = false;
            if (nums[i] < nums[i - 1]) inc = false;
        }

        return inc || d;
    }
}
