class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a = jewels.length();
        int b = stones.length();
        int count = 0;
            for(int j=0; j<b; j++){
                if(jewels.contains(String.valueOf(stones.charAt(j)))){
                    count++;
                }
            }
        return count;
    }
}