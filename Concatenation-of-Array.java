class Solution {
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int[] nums2 = new int[2*a];
        for(int i=0; i<a; i++){
            nums2[i] = nums[i];
        }
        for(int i=a; i<2*a; i++){
            nums2[i] = nums[i-a];
        }
        return nums2;
    }
}