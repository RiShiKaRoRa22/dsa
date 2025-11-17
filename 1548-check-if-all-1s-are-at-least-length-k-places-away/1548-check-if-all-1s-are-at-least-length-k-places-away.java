class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=-1;
        int j=0;
        for(int l=0;l<nums.length;l++){
            if(i==-1 && nums[l]==1){
                i=l;
            }
            else if(nums[l]==1){
                j=l;
                if((j-i)-1 < k ){
                    return false;
            
                } 
                i=l;  
            }

        }
        return true;
        
    }
}