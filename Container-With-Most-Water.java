class Solution {
    public int maxArea(int[] height) {
        int a = height.length;
        int max_area = 0;
        int left = 0, right = a - 1;
        while(left<=right){
            int width = right - left;
            int length = Math.min(height[left],height[right]);
            int area = width * length;
            max_area = Math.max(max_area,area);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}