class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        int maxL = nums[0];  
        int diff = 0;  

        for (int i = 1; i < n - 1; i++) {
            diff = Math.max(diff, maxL - nums[i]); 
            max = Math.max(max, (long) diff * nums[i + 1]); 
            maxL = Math.max(maxL, nums[i]); 
        }
        
        return max;
    }
}
