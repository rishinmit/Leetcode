import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int s = nums.length;
        int c = 0;
        Arrays.sort(nums);
        for(int i=0; i<=s-2; i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
        }
        if(c>0){ return true; }
        else { return false; }
    }
}