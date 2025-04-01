class Solution {
    public double myPow(double x, int n) {
        double num = 1;
        int var = 0;
        if (x == 1) {
            return x;
        }
        if (x == -1) {
            n = Math.abs(n);
            if (n % 2 == 0) {
                return 1;
            } else if (n == 0) {
                return 0;
            } else {
                return -1;
            }
        }

        if (n < -2147483647) {
            return 0.00000;
        }
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                num = num * x;
            }
        } else {
            var = Math.abs(n);
            for (int i = 0; i < var; i++) {
                num = num * x;
            }
        }
        if (n < 0) {
            return 1 / num;
        }
        return num;
    }
}