class Solution {
    public int compress(char[] chars) {
        int a = chars.length;
        int w = 0, r = 0;
        int count = 0;
        while(r<a){
            char current = chars[r];
            count = 0;
            while(r<a && chars[r]==current){
                count++;
                r++;
            }
            chars[w++] = current;
            if(count>1){
                for(Character c : String.valueOf(count).toCharArray()){
                    chars[w++] = c;
                }
            }
        }
        return w;
    }
}