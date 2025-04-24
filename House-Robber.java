class Solution {
    public int rob(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int temp = 0;
        for(int num : nums){
            temp = p1;
            p1 = Math.max(p1, p2 + num);
            p2 = temp;
        }
        return p1;
    }
}