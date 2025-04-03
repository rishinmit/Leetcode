class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        int maxL = nums[0];  
        int diff = 0;  

        for (int j = 1; j < n - 1; j++) {
            diff = Math.max(diff, maxL - nums[j]); 
            max = Math.max(max, (long) diff * nums[j + 1]); 
            maxL = Math.max(maxL, nums[j]); 
        }
        
        return max;
    }
}
