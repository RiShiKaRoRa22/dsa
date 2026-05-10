class Solution {
    public int maximumJumps(int[] nums, int target) {
        //dp
        int[] dp= new int[nums.length];
        
        Arrays.fill(dp,-1);
        dp[0]=0;
        

    for(int j=0;j<nums.length;j++){
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]-nums[j]>= (-target) && nums[i]-nums[j]<=target){
                if(dp[j]!=-1){
                    dp[i]=Math.max(dp[i], dp[j]+1);

                }
                
            
            }
           


        }
    }
        return dp[nums.length-1];


        
    }
}