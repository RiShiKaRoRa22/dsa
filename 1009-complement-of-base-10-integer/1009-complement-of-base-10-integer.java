class Solution {
    public int bitwiseComplement(int n) {
        //to binary, flip bits
        if(n==0){
            return 1;
        }
        int t=n;
        int bits=0;
        while(t!=0){
            bits++;
            t=t>>1;
        }

        int mask= (1<<bits)-1;

        return n^ mask;
      
        
    }
}