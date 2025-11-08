class Solution {
    public String removeOuterParentheses(String s) {
        int i=-1;
        char[] ch= s.toCharArray();
        StringBuilder sb= new StringBuilder();
        for(char st: ch){
            if(st=='('){
                i++;
                if(i>0)sb.append(st);
                
                
            }
            else if(st==')'){
                if(i>0)sb.append(st);
                i--;
            }
        }
        return sb.toString();
        
    }
}