class Solution {
    public int[] maxValue(int[] nums) {
        //aage ka min, peeche ka max, ka max
        int n=nums.length;
        int[] suff= new int[n];
        int[] pref= new int[n];

        int a= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a=Math.max(a, nums[i]);
            pref[i]=a;
        }

        int b=Integer.MAX_VALUE;
        suff[n-1]= nums[n-1];
        
        for(int i=n-2;i>=0;i--){
            b=Math.min(b,nums[i+1]);
            suff[i]=b;
        }
        int[] res= new int[n];
        res[n-1]=pref[n-1];
        for(int i=n-2;i>=0;i--){
            if(pref[i]>suff[i]){
                res[i]=res[i+1];
            }
            else{
                res[i]= pref[i];
            }
        }

        return res;
    }
}