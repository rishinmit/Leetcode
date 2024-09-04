class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low = 2;
        int high = x/2;
        int mid;
        while(low<=high){
            mid = (high + low)/2;
            long mids = (long) mid*mid;
            if(mids == x){
                return mid;
            }
            else if(mids < x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
}