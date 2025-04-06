class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = s.length();
        Set<Character> set = new HashSet<>();
        int maxL = 0, i = 0, j = 0;
        while(i<a && j<a){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxL = Math.max(maxL,j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxL;
    }
}