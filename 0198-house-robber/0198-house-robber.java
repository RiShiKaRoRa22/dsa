class Solution {
    public int rob(int[] nums) {
        //every 3rd , pattern repeats

        //calc every 1 2 3 pattern

        int dp[]= new int[nums.length];
        int maxx=Integer.MIN_VALUE;
        if(dp.length==1){
            return nums[0];
        }
        dp[0]= nums[0];
        dp[1]= nums[1];

        for(int i=0;i<nums.length;i++){
            if((i-2)<0 && (i-1)<0){
                dp[i]= Math.max(0,(nums[i]));

            }
            else if((i-2)<0 && (i-1)>=0){
                dp[i]= Math.max(dp[i-1],(nums[i]));

            }
            
            
            else if((i-2)>=0){
                dp[i]= Math.max(dp[i-1],(dp[i-2]+nums[i]));

            }
            maxx=Math.max(dp[i],maxx);
            
            
        }
        return maxx;

        
        
    }
}