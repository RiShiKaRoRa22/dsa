class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int large=Integer.MIN_VALUE;
                int small= Integer.MAX_VALUE;
                int k=i;
                while(k<=j){
                    
                    large=Math.max(large,nums[k]);
                    small=Math.min(small,nums[k]);
                    k++;
                }
                sum=sum+(large-small);

            }
        }
        return sum;

        
    }
}