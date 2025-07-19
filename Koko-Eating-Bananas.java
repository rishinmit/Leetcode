class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int a = piles.length;
        Arrays.sort(piles);
        int l = 1, r = piles[a-1];
        int result = r;
        int k = 0;
        int hours = 0;
        while(l<=r){
            k = l + (r-l)/2;
            hours = 0;
            for(Integer bananas : piles) {
                hours += Math.ceil((double)bananas / k);
            }
            if(hours<=h) {
                result = Math.min(result,k);
                r = k - 1;
            }
            else if(hours>=h){
                l = k + 1;
            }
        }
        return result;
    }
}