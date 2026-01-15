class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        /* no bin search as complicated, TC becomes o(n) anyways
        int low=0;
        int high=intervals.length-1;
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            if(intervals[mid][0]>=newInterval[0]){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        if(mid>0){
            
        }*/
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        List<int[]> list= new ArrayList<>();
        int i=0;

        for(i=0;i<intervals.length;i++){
           if(intervals[i][1]<newInterval[0] && newInterval[1]>intervals[i][1]){
            list.add(intervals[i]);
           }
           else if(intervals[i][1]> newInterval[0] && newInterval[1]<intervals[i][0] ){
            
            break;
           }
           
           else{
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
           }

        }
        list.add(newInterval);
         while(i<intervals.length){
                list.add(intervals[i]);
                i++;
            }

        int[][] res= new int[list.size()][2];
        for(int j=0;j<list.size();j++){
            res[j]=list.get(j);
        }
        return res;

        
        


        
    }
}