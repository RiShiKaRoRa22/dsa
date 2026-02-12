class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum=sum+n;
        }
        if(sum%2!=0){
            return false;
        }
        int s=(sum/2);

        boolean dp[]= new boolean[(sum/2) +1];
        dp[0]=true;
        for(int num:nums){
            for(int i=s;i>=num;i--){
                if(dp[i-num]){
                    dp[i]=true;
                }
            }
        }

        return dp[s];


        

        
    }
}