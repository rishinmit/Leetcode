class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a>b) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String newS = new String(sArr);
        String newT = new String(tArr);
        if(newS.equals(newT)) return true;
        return false;
    }
}