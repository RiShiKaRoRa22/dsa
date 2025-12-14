class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=0;
        int c=1;
        while(i<nums.length){
            
            if(nums[i]==nums[j] && c<2){
                j++;
                nums[j]=nums[i];
                c++;
                i++;
            }
            else if(nums[i]==nums[j] && c==2){
                
                i++;
            
            }
            else {
                j++;
                
                nums[j]=nums[i];
               
                c=1;
               
                i++;
                
            }
        }
        return j+1;
        
    }
    
}