class Solution {
    public int getLucky(String s, int k) {
        int size = s.length();
        StringBuilder strA = new StringBuilder();
        int res = 0;
        String str = s.toUpperCase();
        char[] ch1 = str.toCharArray();
        for (int i = 0; i < size; i++) {
            res = (int) ch1[i] - 64;
            strA.append(res);
        }
        String strB = strA.toString();
        int size2 = strB.length();
        char[] ch2 = strB.toCharArray();
        int charInt = 0;
        for (int i = 0; i < size2; i++) {
            charInt += ch2[i] - '0';
        }

        int rem = 0, temp = 0;
        if (k != 1) {
            while (k > 1) { 
                temp = 0;
                while (charInt > 0) {
                    rem = charInt % 10;
                    temp += rem;
                    charInt /= 10;
                }
                charInt = temp;
                k--;
            }
        } else {
            while (k == 1) {
                charInt = 0;
                for (int i = 0; i < size2; i++) {
                    charInt = charInt + ch2[i] - '0';
                }
                k--;
            }
        }
        return charInt;
    }
}
