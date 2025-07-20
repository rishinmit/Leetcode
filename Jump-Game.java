class Solution {
    public boolean canJump(int[] nums) {
        int a = nums.length;
        int maxIndex = 0;
        for(int i=0; i<a; i++){
            if(i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return true;
    }
}