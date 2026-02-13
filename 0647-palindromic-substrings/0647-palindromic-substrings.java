class Solution {
    public int countSubstrings(String s) {
        int count=0;
        //int i=0;
        //int j=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s,i,j)){
                    count++;
                }
            }
        }
        /*while(j<s.length()){
            if(isPalindrome(s,i,j)){
                count++;
            }
            j++;
        }
        while(i<j){
            if(isPalindrome(s,i,j)){
                count++;
            }
            i++;
        }*/
        return count;
        
    }

    public boolean isPalindrome(String s, int i, int j){
        if(i==j){
            return true;
        }
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