class Solution {
    

    public List<List<String>> partition(String s) {
       
        StringBuilder sb= new StringBuilder();
        List<String> curr = new ArrayList<>();
        List<List<String>> result= new ArrayList<>();

        backtrack(result,curr,s,0);
        return result;


        
    }
    public void backtrack(List<List<String>> result,List<String> curr, String s, int ind ){
        if(ind==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=ind;i<s.length();i++){
            String sb=s.substring(ind, i+1);
            
            if(isPal(sb)){
                curr.add(sb);
                backtrack(result,curr,s,i+1);
                curr.remove(curr.size()-1);
            }
           
        }

        
    }

    public boolean isPal(String s){
        if(s.length()==1){
            return true;
        }

        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true; 
        
    }
}