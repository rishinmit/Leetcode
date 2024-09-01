import java.util.*;
import java.io.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArr = new int[m+n];
        System.arraycopy(nums1,0,newArr,0,m);
        System.arraycopy(nums2,0,newArr,m,n);
        int a = m+n;
        Arrays.sort(newArr);
        if((a)%2==0){
        double median = ( newArr[(a)/2] + newArr[((a)/2)-1] ) / 2.0;
        return median;
        }
        else{

            return newArr[(a-1)/2];
        }
        }
    }