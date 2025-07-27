class Solution {
    public boolean isSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a > b) return false;
        int prevIndex=0;
        for(int i = 0; i < a; i++){
            boolean found = false;
            for(int j = prevIndex; j < b; j++){
                if(s.charAt(i)==t.charAt(j)){
                prevIndex = j+1;
                found = true;
                break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}