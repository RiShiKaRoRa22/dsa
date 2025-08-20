class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> soln= new ArrayList<>();
        backtrc(nums,0,res, soln);
        return res;

        
    }

    public void backtrc(int[] nums,int index, List<List<Integer>> res, List<Integer> soln){
        List<Integer> idk= new ArrayList<>(soln);
        res.add(idk);
        for(int i=index;i<nums.length;i++){
            soln.add(nums[i]);
            backtrc(nums,i+1,res,soln);
            soln.remove(soln.size()-1);
        }

        
        


    }
}