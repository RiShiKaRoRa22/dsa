class Solution {
    List<String> answer= new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set= new HashSet<>(wordDict);
        //Map<Integer, List<String>> map= new HashMap<>();
        if(!canBreak(s,set)){
            return new ArrayList<>();
        }
        solve(0,s,set, "");
        return answer;

        
       
        
    }
    public boolean canBreak(String s, Set<String> set){
        boolean dp[]= new boolean[s.length()+1];
        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }

            }
        }
        return dp[s.length()];


    }// check if the string is even  breakable or not

    public void solve(int start, String s, Set<String> set, String result){
        /*if(memo.containsKey(start)){
            return memo.get(start);
        }

        List<String> answer= new ArrayList<>();*/
        if(s.length()==start){
            answer.add(result.trim());
            
        }

        for(int i=start;i<s.length();i++){
            String str= s.substring(start, i+1);
            if(set.contains(str)){
                solve(i+1, s,set,result+str+" ");
            }
        }
    }
    
}