class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        String s = "";
        int i = 0;
        for(Object o : strs){
            s = (String) o;
            try{
                i = Integer.parseInt(s);
                max = Math.max(max,i);
            }
            catch(NumberFormatException e){
                max = Math.max(max,s.length());
            }
        }
        return max;
    }
}