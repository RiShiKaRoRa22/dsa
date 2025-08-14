class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9;i>=0;i--){
            String a= String.valueOf(i);
            String str= a+a+a;
            if(num.contains(str)){
                return str;

            }

        }
        return "";

        
    }
}