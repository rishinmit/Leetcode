class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a = nums.length;
        int[] prefix = new int[a];
        int[] suffix = new int[a];
        int[] answer = new int[a];
        prefix[0] = 1;
        suffix[a-1] = 1;
        for(int i=1; i<a; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int i=a-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<a; i++){
            answer[i] = prefix[i]*suffix[i];
        }
        return answer;
    }
}