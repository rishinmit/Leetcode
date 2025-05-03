class Solution {
    public int majorityElement(int[] nums) {
        int a = nums.length;
        int majority = a / 2;
        int  ans = -1;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            if(hmap.containsKey(num)){
                hmap.put(num, hmap.get(num) + 1);
            }
            else{
                hmap.put(num,1);
            }
        }
        for(var num : hmap.entrySet()){
            if(num.getValue() > majority){
                ans = num.getKey();
            }
        }
        return ans;
    }
}