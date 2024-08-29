import java.util.*;
public class Solution {
    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll(\[^a-z0-9]\, \\);
        StringBuffer str = new StringBuffer(s1);
        str.reverse();
        if (str.toString().equals(s1)) {
            return true;
        } else {
            return false;
        }
    }
}