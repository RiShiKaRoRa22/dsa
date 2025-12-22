class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int sum=0;
        for(int i:nums){
            if(sum<0){
                return false;
            }
            if(i>sum){
                sum=i;
            }
            
            sum--;
            
           
            
        }
        return true;
        
    }
}