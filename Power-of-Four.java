class Solution {
    public boolean isPowerOfFour(int n) {
        double log = Math.log(n) / Math.log(4);
        log = Math.round(log);
        if(n!=0 && n == Math.pow(4,log)) return true;
        return false;
    }
}