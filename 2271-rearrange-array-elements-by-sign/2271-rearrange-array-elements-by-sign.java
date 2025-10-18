class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos= new int[nums.length/2];
        int[] neg= new int[nums.length/2];
        int i=0;
        int j=0;

        int res[]= new int[nums.length];

        for(int x: nums){
            if(x>0){
                pos[i++]=x;
            }
            else{
                neg[j++]=x;
            }
        }
        int k=0;

        for(i=0,j=0,k=0; k<nums.length; i++,j++,k++){
            res[k++]=pos[i];
            res[k]=neg[j];

        }
        return res;
        
    }
}