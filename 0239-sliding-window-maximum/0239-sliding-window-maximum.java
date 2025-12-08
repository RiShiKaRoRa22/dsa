class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //Stack<Integer> stack= new Stack<>();
        //i to i+k tak
        List<Integer> list= new ArrayList<>();
        
        Deque<Integer> dq= new ArrayDeque<>(); //store indices
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && i-k>= dq.peekFirst()){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            
            dq.addLast(i);
            if(!dq.isEmpty() && i>=k-1){
                list.add(nums[dq.peekFirst()]);
            }
        }

        int res[]= new int[list.size()];
        int b=0;
        for(int i:list){
            res[b++]=i;
        }
        return res;


    }
}