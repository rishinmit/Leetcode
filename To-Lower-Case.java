class Solution {
    public String toLowerCase(String s) {
        int a = s.length();
        StringBuilder strb = new StringBuilder();
        for(int i=0; i<a; i++){
            char lowered = s.charAt(i);
            if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z'){
                lowered = (char)(s.charAt(i) + 32);
            }
            strb.append(lowered);
        }
        return strb.toString();
    }
}