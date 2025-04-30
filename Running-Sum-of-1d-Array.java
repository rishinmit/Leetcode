class Solution {
    public int[] runningSum(int[] nums) {
        int a = nums.length;
        for(int i=1; i<a; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}