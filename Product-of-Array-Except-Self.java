class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a = nums.length;
        int[] ans = new int[a];
        ans[0] = 1;
        for(int i=1; i<a; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int i=a-2; i>=0; i--){
            suffix = suffix * nums[i+1];
            ans[i] = suffix * ans[i];
        }
        return ans;
    }
}