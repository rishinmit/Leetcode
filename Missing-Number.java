class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        Arrays.sort(nums);
        int i=0;
        for(i=0; i<a; i++){
            if(i!=nums[i]){
                return i;
            }
        }
        if(i!=nums[a-1]) return i++;
        return -1;
    }
}