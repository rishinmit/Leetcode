class Solution {
    public boolean isAnagram(String s, String t) {
        int a = t.length();
        int b = s.length();
        int c =0;
        if(b>a){
            return false;
        }
        List<String> myL = new ArrayList<String>(Arrays.asList(s.split("")));
        char[] arr = t.toCharArray();
        for(int i =0; i<a ; i++){
            if(myL.contains(String.valueOf(arr[i]))){
                c++;
                myL.remove(String.valueOf(arr[i]));
            }
        }
        if(c==a){
            return true;
        }
        return false;
    }
}