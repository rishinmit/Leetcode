class Solution {
    public int[] moveZeroes(int[] nums) {
        int a = nums.length;
        int l = 0;
        int temp;
        for(int r=0; r<a; r++){
            if(nums[r] != 0){
                temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        return nums;
    }
}