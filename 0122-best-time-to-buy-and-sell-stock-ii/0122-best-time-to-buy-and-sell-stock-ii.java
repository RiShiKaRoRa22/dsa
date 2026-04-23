class Solution {
    public int maxProfit(int[] prices) {
        int buy=-1;
        int sell=-1;
        int total=0;
        for(int i=0;i<prices.length;i++){
            if(buy==-1){
                buy=i;
            }
            else if(sell==-1 && prices[i]>prices[buy]){
                sell=i;
                total=total+(prices[sell]-prices[buy]);
                sell=-1;
                buy=i;
            }
            else{
                buy=i;

            }
        }
        return total;
    }
}