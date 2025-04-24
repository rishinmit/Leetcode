class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int oneEle = m-1;
        int twoEle = n-1;
        int mergEle = n + m - 1;
        while(oneEle>=0 && twoEle>=0){
            if(nums1[oneEle] > nums2[twoEle]){
                nums1[mergEle] = nums1[oneEle];
                mergEle--;
                oneEle--;
            }
            else{
                nums1[mergEle] = nums2[twoEle];
                mergEle--;
                twoEle--;
            }
        }
        while(twoEle>=0){
            nums1[mergEle--] = nums2[twoEle--];
        }
    }
}