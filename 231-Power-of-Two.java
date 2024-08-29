import java.util.*;
import java.io.*;
import java.lang.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        int c = 0;
        double p;
        int temp;
        if(n==1){
            return true;
        }   
        else if(n % 2 == 0){
            temp = n;
            while(n>1){
                n = n / 2;
                c++;
            }
            p = Math.pow(2,c);
            if(p == temp){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}