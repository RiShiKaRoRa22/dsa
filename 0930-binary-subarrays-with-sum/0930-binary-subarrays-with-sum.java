class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int a=lesserThan(nums,goal);
        int b=lesserThan(nums,goal-1);
        return a-b;

        
    }
    public int lesserThan(int[] nums, int goal){
        if(goal<0){
            return 0;
        }
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(j<nums.length && i<nums.length){
            sum=sum+nums[j];
            while(sum>goal && i<nums.length){
                sum=sum-nums[i];
                i++;
            }
            count=count+(j-i+1);
            j++;   
        }
        
        return count;

    }
}