class Solution {
    public int maximum69Number (int num){
        String str= String.valueOf(num);
        char arr[]= str.toCharArray();
        int numarr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            numarr[i]=arr[i]-'0';
        }

        int max=num;
        for(int i=0;i<numarr.length;i++){
            if(numarr[i]==6){
                numarr[i]=9;
            }
            else if(numarr[i]==9){
                numarr[i]=6;
            }
            int sum=0;
            for(int nu: numarr){
                sum=sum*10+nu;
            }
            max=Math.max(max,sum);
            if(numarr[i]==6){
                numarr[i]=9;
            }
            else if(numarr[i]==9){
                numarr[i]=6;
            }
        }
        return max;

    }
}