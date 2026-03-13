class Solution {
    public boolean isPowerOfTwo(int n) {
        //bit manip property, n& n-1
        if(n<=0){
            return false;
        }
        

        
        return ((n & (n-1))==0) ;
    }
}