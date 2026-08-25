class Solution {
    public int missingMultiple(int[] nums, int k) {
        //add in set for 0(1) lookup?
        Set<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int i=1;
        while(i<=101){
            if(!set.contains(k*i)){
                return k*i;
            }
            i++;


        }
        return -1;
        
    }
}