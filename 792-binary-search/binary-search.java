class Solution {
    public int search(int[] nums, int target) {
        int a = nums.length;
        int l = 0;
        int r = a-1;
        while(l<=r){
           int mid = (l + r) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                r = mid-1;
            }
            else if(nums[mid]<target){
                l = mid+1;
            }
        }
        return -1;
    }
}