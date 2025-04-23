class Solution {
    public boolean isPowerOfThree(int n) {
        long num = (long) n;
        double log = Math.log(num) / Math.log(3);
        log = Math.round(log);
        if(num!=0 && Math.pow(3,log) == num) return true;
        return false;
    }
}