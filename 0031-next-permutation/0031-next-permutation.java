class Solution {
    public void nextPermutation(int[] nums) {
        /*List<Integer> list= new ArrayList<>();
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> num= new ArrayList<>();
        List<Integer> numog= new ArrayList<>();
        for(int i: nums){
            num.add(i);
            numog.add(i);
        }
        Collections.sort(num);
        int[] used= new int[nums.length];
        Arrays.fill(used,0);
        int index=0;
        
        
        backtrack(num,result,list,used);
        for(int i=result.size()-1;i>0;i--){
            if(result.get(i).equals(numog)){
                index=i;
                break;
            }
        }
        /*for(List<Integer> l: result){
            if(l.equals(numog)){
                index=result.indexOf(l);
                break;

            }
        }
        index++;
        index=index%result.size();
        List<Integer> li= new ArrayList<>(result.get(index));
        int a=0;
        for(int i: li){
            nums[a++]=i;
        }
        
    }
    public void backtrack(List<Integer> num,List<List<Integer>> result,List<Integer> list,int[] used){
        if(num.size()==list.size()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<num.size();i++){
            if(used[i]==0){
                list.add(num.get(i));
                used[i]=1;
                backtrack(num,result,list,used);
                used[i]=0;
                list.remove(list.size()-1);
            }

        }*/
        int idx=-1;

        for(int i=nums.length-1;i>0;i--){

            if(nums[i-1]<nums[i]){
                idx=i-1;
                break;
            }
        }
        if(idx==-1){
            arrreverse(nums,0,nums.length-1);
            return;
        }
        //int minnum=100;
        int idxx=-1;
        for(int i=nums.length-1;i>0;i--){

            if(nums[i]>nums[idx]){
               // minnum=Math.min(minnum,nums[i]);      
                idxx=i;
                break; 
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[idxx];
        nums[idxx]=temp;

        arrreverse(nums, idx+1, nums.length-1);


    }


    public void arrreverse(int[] nums, int i, int j){
        
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;

        }
    }
}