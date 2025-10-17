class Solution {
    public int maxSubArray(int[] nums) {
       /* int i=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
            
            if(sum<0){
                sum=0;
            }
        }
        return max;*/

        if(nums.length==1){
            return nums[0];
        }
        int i=0;// start
        int j=0; //end
        int maxx=Integer.MIN_VALUE;
        int sum=0;

        while(i<=j && j<nums.length){
            sum=sum+nums[j];
            maxx=Math.max(maxx,sum);
            
            while(sum<=0 && i<=j){
                
                    sum=sum-nums[i];
                    i++;
                  
            }
            j++;
            //maxx=Math.max(maxx,sum);
            
        }
        return maxx;
        
    }
}