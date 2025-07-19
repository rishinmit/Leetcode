class Solution {
    public void reverseString(char[] s) {
        int a = s.length;
        int l = 0, r=a-1;
        while(l<=r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}