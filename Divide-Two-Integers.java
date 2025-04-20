class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = true;
        if(divisor==dividend) return 1;
        if(dividend == 1 && dividend > divisor) return divisor;
        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)){
            sign = false;
        }
        else if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
            sign = true;
        }
        long num = Math.abs((long) dividend);
        long div = Math.abs((long) divisor);   
        int ans = 0;

        while (num >= div) {
            int c = 0;
            while (num >= (div << (c + 1))) {
                c++;
            }
            ans = ans + (1 << c);
            num = num - (div << c);
        }

        return sign ? ans : -ans;
    }
}
