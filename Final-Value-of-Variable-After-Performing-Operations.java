class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        int a = operations.length;
        for(String opr : operations){
            if(opr.equals("++X")){
                ++X;
            }
            else if(opr.equals("X++")){
                X++;
            }
            else if(opr.equals("--X")){
                --X;
            }
            else{
                X--;
            }
        }
        return X;
    }
}