class Solution {
    public int[] sumZero(int n) {
        int l=0, r=n-1;
        int[] nums = new int[n];
        int mid = l + (r-l)/2;
        nums[mid] = 0;
        while(l<r){
            int random = n;
            int negRandom = -n;
            nums[l] = negRandom;
            nums[r] = random;
            l++;
            r--;
            n--;
        }
        return nums;
    }
}