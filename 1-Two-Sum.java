import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = nums.length;
        int[] n = new int[2]; 
        for(int i=0; i < s; i++){
            for(int j=i+1; j < s; j++){
                if(nums[i] + nums[j] == target){
                    n[0]=i;
                    n[1]=j;
                    return n;
                }
            }
        }
        return n;
    }
}