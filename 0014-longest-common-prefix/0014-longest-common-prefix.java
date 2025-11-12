class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        if(strs.length==1){
            return prefix;
        }

        for(String s: strs){
            while(s.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }

        }
        return prefix;
        
        
        
    }
}