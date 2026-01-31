class Solution {
     List<List<Integer>> res= new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,nums,0);
        return res;

        
    }

    public void backtrack(List<Integer> list,int[] nums, int ind){

        res.add(new ArrayList<>(list));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i-1]==nums[i]){
                continue;
            }
            list.add(nums[i]);
            backtrack(list,nums,i+1);
            list.remove(list.size()-1);

        }
    }
}