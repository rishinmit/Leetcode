class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int c=0, i=0;
        while(i<nums.length-1){
            if(nums[i] == nums[i+1]){
                c++;
            }
            i = i + 2;
        }
        if(c==nums.length/2) return true;
        else return false;
    }
}