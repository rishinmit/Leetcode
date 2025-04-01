class Solution {
    public int maximumDifference(int[] nums) {
        int a = nums.length;
        int max = 0;
        int current = nums[0];
        for(int i=1; i<a; i++){
            if(current > nums[i]){
                current = nums[i];
            }
            max = Math.max(max,nums[i] - current);
        }
        if(max == 0){
            return -1;
        }
        return max;
    }
}