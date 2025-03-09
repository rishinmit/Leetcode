class Solution {
    public int countKDifference(int[] nums, int k) {
        int a = nums.length;
        int c = 0;
        for(int i=0; i<a-1; i++){
            for(int j=i+1; j<a; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    c++;
                }
            }
        }
        return c;
    }
}