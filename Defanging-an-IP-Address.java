class Solution {
    public String defangIPaddr(String address) {
        int a = address.length();
        StringBuilder strb = new StringBuilder();
        for(int i=0; i<a; i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                strb.append("[.]");
            }
            else{
                strb.append(ch);
            }
        }
        return strb.toString();
    }
}