class Solution {
    public int[] separateDigits(int[] nums) {
        //iterate thru nums
        List<Integer> list= new ArrayList<>();
        for(int i: nums){
            List<Integer> l= new ArrayList<>();
            while(i>0){
                int d= i%10;
                l.add(d);
                i=i/10;
            }
            Collections.reverse(l);
            list.addAll(l);
            
        }
        int k=list.size();
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;
        
    }
}