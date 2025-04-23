class Solution {
    public boolean isPowerOfTwo(int n) {
        long num = (long) n;
        double log = Math.log(num) / Math.log(2);
        log = Math.round(log);
        if(num!=0 && num == Math.pow(2,log)) return true;
        return false;
    }
}