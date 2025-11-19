class Solution {
    public int findFinalValue(int[] nums, int original) {
        int og=original;
        int res=original;
        while(og!=-1){
            int found=0;
            for(int i:nums){
                if(i==og){
                    i= 2*og;
                    og=i;
                    res=og;
                    found=1;
                }
            }
            if(found==0){
                og=-1;
            }

        }
        return res;
        
    }
}