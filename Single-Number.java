class Solution {
    public int singleNumber(int[] nums) {
        int xorN = 0;
       for(int num : nums){
        xorN = xorN ^ num;
       }
       return xorN;
    }
}