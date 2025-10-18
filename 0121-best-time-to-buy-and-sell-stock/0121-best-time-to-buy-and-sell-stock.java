class Solution {
    public int maxProfit(int[] prices) {
        /*int max=0;
        int i=0;
        int sum=0;
        int len=prices.length;
        for(i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                sum= prices[j]-prices[i];
                max= Math.max(max,sum);

            }
        }
        return max;*/ //brute force TLE

        /*int buy=prices[0];
        int sell=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            sell= prices[i]-buy;
            max=Math.max(max,sell);



        }
        return max;*/

        int buy=prices[0];
        int sell=prices[0];
        int maxx=0;

        for(int x: prices){
            if(x<buy){
                buy=x;
            }
            int price= x-buy;
            maxx= Math.max(maxx,price);
        }
        return maxx;

        





    }
}