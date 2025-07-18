class Solution {
    public int compress(char[] chars) {
        int a = chars.length;
        if(a==1) return 1;
        int i=0, j=0, count;
        String str = "";
        while(i<a){
            char current = chars[i];
            count = 0;
            while(j<a && current==chars[j]){
                count ++;
                j++;
            }
            i=j;

            if(count==1){
                str += Character.toString(current);
                }
            else if(count>2 && count < 10){
            str += Character.toString(current);
            str += Integer.toString(count);
            }
            else{
                str += Character.toString(current);
                String countStr = String.valueOf(count);
                String[] countArr = countStr.split("");
                for(String s : countArr){
                    str += s;
                }
            }
        }
        int len = str.length();
        for(int k=0; k<len; k++){
            chars[k] = str.charAt(k);
        }
        return len;
    }
}