import java.util.Arrays;
class Solution {
    public boolean check(int[] nums) {
        int[] numscopy=new int[nums.length];
        int j=0;
        for(int x:nums){
            numscopy[j]=x;
            j++;
        }

        Arrays.sort(numscopy);
        if(Arrays.equals(numscopy,nums)){
            return true;
        }

        for(int i=0;i<nums.length;i++){
           if(Arrays.equals(rotatearr(numscopy,i), nums)){
            return true;
           } 

        }

        return false;

   
    }

    public int[] rotatearr(int[] arr, int k){
        int last=arr[arr.length-1];
        for(int i=(arr.length-1);i>0;i--){
            arr[i]=arr[i-1];    
        }
        arr[0]=last;
        return arr;

    }
}