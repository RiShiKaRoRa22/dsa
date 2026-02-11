class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        //totalsum + s /2= s1
        int sum=0;

        for(int i:nums){
            sum+=i;
        }
        if(Math.abs(target)>sum || (sum+target)%2!=0 ){
            return 0;
        }
        int s1=(sum+target)/2;
        //number of ways to make s1 from nums

        int dp[]= new int[s1+1];
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int num:nums){
            for(int i=s1;i>=num;i--){
                dp[i]+=dp[i-num];
            }
        }
       
        return dp[s1];

        
    }
}