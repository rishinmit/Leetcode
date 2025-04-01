class Solution {
    public boolean isAnagram(String s, String t) {
        int c = 0;
        if (s.length() > t.length()) {
            return false;
        }
        List<String> myL = new ArrayList<String>(Arrays.asList(s.split("")));
        char[] arr = t.toCharArray();
        for (int i = 0; i < t.length(); i++) {
            if (myL.contains(String.valueOf(arr[i]))) {
                c++;
                myL.remove(String.valueOf(arr[i]));
            }
        }
        if (c == t.length()) {
            return true;
        }
        return false;
    }
}