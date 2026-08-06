class Solution {
    public int smallestNumber(int n, int t) {
        int d=n;
        int ans=0;

        while(d<=100){
            int dd=product(d);
            if(dd%t==0){
                ans=d;
                return d;
            }
            else{
                d++;
            }

        }
        return ans;
        
    }

    public int product(int n){
        int d=n;
        int pr=1;
        while(d>0){
            pr= pr*(d%10);
            d=d/10;
        }
        return pr;
    }
}