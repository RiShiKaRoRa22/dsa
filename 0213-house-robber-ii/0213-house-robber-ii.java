class Solution {
    public int rob(int[] nums) {
        int dp1[]= new int[nums.length];
        int dp2[]= new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        dp1[0]=nums[1];
        dp2[0]=nums[0];
        int curone=0;
        int curtwo=0;
        int maxx1=0;
        int maxx2=0;
        for(int i=1;i<nums.length;i++){
            
            dp1[i]=Math.max(curone,nums[i]+curtwo);
            curtwo=curone;
            curone=dp1[i];
            maxx1=Math.max(dp1[i],maxx1);
        }
        curone=0;curtwo=0;

        for(int i=0;i<nums.length-1;i++){
            
            dp2[i]=Math.max(curone,nums[i]+curtwo);
            curtwo=curone;
            curone=dp2[i];
            maxx2=Math.max(dp2[i],maxx2);
        }
        return Math.max(maxx1,maxx2);
        
    }
}