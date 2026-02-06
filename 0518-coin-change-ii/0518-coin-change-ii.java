class Solution {
    public int change(int amount, int[] coins) {
        if(amount==0){
            return 1;
        }
        int dp[]= new int[amount+1];
        Arrays.fill(dp,0);
        dp[0]=1;

        
            for(int coin:coins){
                for(int i=coin;i<amount+1;i++){
                if(coin<=i ){
                    dp[i]+=dp[i-coin];
                }
            }
        }

        return dp[amount];





        
    }
}