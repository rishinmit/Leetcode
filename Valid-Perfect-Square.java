class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left = 2;
        int right = num/2;
        while(left<=right){
            int mid = left + (right-left)/2;
            long mids = (long)mid * mid;
            if(mids==num) return true;
            else if(mids<num) left = mid+1;
            else right = mid-1;
        }
        if(right * right == num) return true;
        return false;
    }
}