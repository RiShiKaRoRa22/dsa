class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
       //range 1 max in array
       int max=Integer.MIN_VALUE;
       for(int i:nums){
        max=Math.max(max,i);
       }

       int low=1;
       int high=max;
       while(low<high){
        int mid=(low+high)/2;
        if(sumofEl(nums,threshold,mid)){
            high=mid;   
        }
        else{
            low=mid+1;
            
        }
       }
       return low;
        
    }

    public boolean sumofEl(int[] arr, int threshhold,int div){
        double sum=0;
        for(int i:arr){
            sum=sum+(double)Math.ceil((double)i/div);
        }
        if(sum<=threshhold){
            return true;
        }
        return false;
    }
}