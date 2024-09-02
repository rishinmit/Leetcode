class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        int i=0;
        for(i = 0; i < chalk.length; i++){
            sum += chalk[i];
        }
        k %= sum;
        for(i=0; i<chalk.length; i++){
            if(k<chalk[i]){
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
}
