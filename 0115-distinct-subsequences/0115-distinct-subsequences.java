class Solution {
    public int numDistinct(String s, String t) {
        //lcs, number of ways to make lcs from string s
        //NOPE
        //for each matching character, either take it or dont p[i-1][j-1] (take it) OR DONT(dp[i-1][j])

        int n=s.length();
        int m=t.length();

        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }

        /*for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }*/

        

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]= dp[i-1][j]+dp[i-1][j-1];
                    
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[n][m];

        /*Stringbuilder sb= new StringBuilder();
        int i=n+1;
        int j=m+1;

        while(i>0 && j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                sb.append(s.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                sb.append(s.charAt(i-1));
                i--;
            }
            else{
                sb.append(t.charAt(j-1));
                j--;
            }
        }*/
        
    }
}