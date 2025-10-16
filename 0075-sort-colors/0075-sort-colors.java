
class Solution {
    public void sortColors(int[] nums) {

        int len= nums.length;

        int i=0;
        int j=0;
        int k=0;

        while(k<3 ){
            j=i;;
            
            while( j<len && i<len){
                 if(nums[j]==k){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                 } 
                 j++;

            }
            k++;
        }
        
        
        
    }

    
}