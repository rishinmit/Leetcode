class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int a =nums.length;
        int[] indices = new int[2];
        for(int i=0; i<a; i++){
            int subbtract = (target - nums[i]);
            if(hmap.containsKey(subbtract)){
                indices[0] = i;
                indices[1] = hmap.get(subbtract);
                break;
            }
            hmap.put(nums[i],i);
        }
        return indices;
    }
}