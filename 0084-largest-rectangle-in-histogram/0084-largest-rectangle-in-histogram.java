class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack= new Stack<>();
        
        int maxarea=0;
        int i=0;
        for(i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]> heights[i]){
                int idx=stack.pop();
                if(stack.isEmpty()){
                maxarea=Math.max(maxarea,heights[idx] *(i));
                }
                else{
                    maxarea= Math.max(maxarea,heights[idx]*(i-stack.peek()-1) );

                }        
            }
            stack.push(i);  
        }
        int n= heights.length;

        while(!stack.isEmpty()){
            int idx= stack.pop();
            if(stack.isEmpty()){
                maxarea=Math.max(maxarea,heights[idx] *(n));
            }
            else{
                maxarea=Math.max(maxarea,heights[idx] *(n-stack.peek()-1));

            }
        }
        return maxarea;
        
    }
}