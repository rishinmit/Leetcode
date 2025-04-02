class Solution {
    public int findMiddleIndex(int[] nums) {
        int a = nums.length;
        for(int i=0; i<a; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0; j<i; j++){
                sum1+=nums[j];
            }
            for(int k=i+1; k<a; k++){
                sum2+=nums[k];
                }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}