class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        return set.size() == 0;
    }
}