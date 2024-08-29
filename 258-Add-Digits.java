class Solution {
    public int addDigits(int num) {
        int n = num;
        int rem, temp;
        if(n==0){
            return 0;
        }
        else{
            while(n>=10){
                rem = n % 10;
                n = n - rem;
                temp = n / 10;
                n = temp + rem;
            }
        }
        return n;
    }
}