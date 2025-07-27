class Solution {
    public void reverse(int[] nums, int l, int h){
        while(l<h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        int a = nums.length;
        k %= a;
        reverse(nums, 0, a-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, a-1);
    }
}