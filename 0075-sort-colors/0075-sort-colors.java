class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;

        int i=0;

        while(i<=right){
            if(nums[i]==0){
                int t=nums[left];
                nums[left]=nums[i];
                nums[i]=t;
                i++;
                left++;

            }
            else if(nums[i]==2){
                int t=nums[right];
                nums[right]=nums[i];
                nums[i]=t;
                //i++;
                right--;
            }
            else{
                i++;
            }
        }
        
    }
}