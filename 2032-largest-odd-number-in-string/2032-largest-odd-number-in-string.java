class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb= new StringBuilder();
        char[] ch= num.toCharArray();
        int len=ch.length-1;
        int index=-1;
        for(int j=len;j>=0;j--){
            if((ch[j]-'0')%2!=0){
                index=j;
                break;
            }   
        }

        if(index==-1){
            return sb.toString();
        }
        for(int i=0;i<=index;i++){
            sb.append(ch[i]);
        }

        return sb.toString();

        
    }
}