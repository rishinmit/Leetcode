class Solution {
    public int[] moveZeroes(int[] nums) {
        int a = nums.length;
        ArrayList<Integer> numsList = new ArrayList<>();
        for(Integer num : nums){
            if(num==0){
                continue;
            }
            numsList.add(num);
        }
        for(Integer num : nums){
            if(num==0){
            numsList.add(num);
            }   
        }
        for(int i=0; i<a; i++){
            nums[i] = numsList.get(i);
        }
        return nums;
    }
}