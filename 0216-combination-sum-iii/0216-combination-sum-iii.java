class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list= new ArrayList<>();
        backtrack(list,k,n,1);
        return res;


        
    }
    public void backtrack(List<Integer> list, int k,int n, int num){
        if(n<0){
            return;
        }
        if(list.size()==k && n==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=num;i<10;i++){
            list.add(i);
            backtrack(list,k,n-i,i+1);
            list.remove(list.size()-1);
        }
    }
}