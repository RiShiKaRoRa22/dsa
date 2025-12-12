class Solution {
    public int maximalRectangle(char[][] matrix) {
        int prefixsum[][]= new int[matrix.length][matrix[0].length];
        for(int j=0;j<matrix[0].length;j++){
            int sum=0;
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][j]=='0'){
                    sum=0;
                }
                else{
                    sum=sum+(matrix[i][j]-'0');
                }
                prefixsum[i][j]=sum;
            }
        }

        int maxarea=Integer.MIN_VALUE;
        

        for(int i=0;i<prefixsum.length;i++){
            Stack<Integer> stack= new Stack<>();
            for(int j=0;j<prefixsum[0].length;j++){
                while(!stack.isEmpty() && prefixsum[i][j]< prefixsum[i][stack.peek()]){
                    int idx= stack.pop();
                    if(stack.isEmpty()){
                      maxarea=Math.max(maxarea,prefixsum[i][idx]*j);
                    }
                    else{
                        maxarea=Math.max(maxarea,prefixsum[i][idx]*(j-1-stack.peek()));
                    }
                }
                stack.push(j);
            } 
                while(!stack.isEmpty()){
                int idx= stack.pop();
                if(stack.isEmpty()){
                  maxarea=Math.max(maxarea,prefixsum[i][idx]*matrix[0].length);
                }
                else{
                 maxarea=Math.max(maxarea,prefixsum[i][idx]*(matrix[0].length-stack.peek()-1));
                }
            }  
        }
        
        return maxarea;

        
        
    }
}