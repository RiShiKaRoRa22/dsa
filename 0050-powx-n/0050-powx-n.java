class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        double nn=n;
        if(nn<0){
            nn=-nn;
            x=1/x;
        }

        if(nn==1){
            return x;
        }

        while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn=nn/2;
            }
            else{
                nn=nn-1;
                ans=ans*x;

            }
        }
        return ans;

    }
        
}