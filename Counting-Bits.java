class Solution {
    public int binary(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n % 2);
            n = n / 2;
        }
        int count = 0;
        String str = sb.reverse().toString();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i < n + 1; i++){
            ans[i] = binary(i);
        }
        return ans;
    }
}