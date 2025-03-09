class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c = 0;
        int a = nums.size();
        for(int i =0; i<a-1; i++){
            for(int j=i+1; j<a; j++){
                if(nums.get(i) + nums.get(j) < target){
                    c++;
                }
            }
        }
        return c;
    }
}