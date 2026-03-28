class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);

        while(i<=j){
            long t=i*i + j*j;
            if(t==(long)c){
                return true;
            }
            else if(t<c){
                i++;
            }
            else{
                j--;
            }


        }
        return false;
        
    }
}