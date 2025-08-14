class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount=0;
        int count=0;
        int j=0;
        int i=0;
        int maxcount=0;
        for(i=0;i<nums.length;i++){

            if(nums[i]==0 ){
                zerocount++;
            }
                while(zerocount>1){
                    if(nums[j]==0){
                        zerocount--;
                    }
                    j++;   
                }

            maxcount= Math.max(i-j,maxcount);
        }
        return maxcount;
        
        
    }
}