class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]= new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]==true && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
        
    }

    /*public void backtract(String s, List<String> wordDict,StringBuilder sb, int index){
        if(sb.toString().equals(s)){
            return true;
        }
        for(int i=index;i<wordDict.size();i++){

        }*/


    
}