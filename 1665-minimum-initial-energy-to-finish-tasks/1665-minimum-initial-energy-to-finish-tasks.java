import java.util.Comparator;
class Solution {
    public int minimumEffort(int[][] tasks) {
        //bin search
        //2 conditions: 1. check if sum actual i <= energy, 2. bin search bw 1 to sum mini;

        int sumofmin=0;
        int sumofactual=0;
        for(int[] i: tasks){
            sumofmin+=i[1];
            sumofactual+=i[0];
        }

        Arrays.sort(tasks, (a,b)-> Integer.compare(b[1]-b[0],a[1]-a[0]));
        //bin search bw 1 to sumofmin
        int ans=0;
        int start=0;
        int end=sumofmin;
        while(start<=end){
            int mid=(start+end)/2;
            if(isPossible(tasks,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;

        
    }

    public boolean isPossible(int[][] tasks, int eng){
        for(int[] i : tasks){
            if(eng>=i[1]){
                eng-=i[0];
            }
            else{
                return false;
            }
        }
        return true;


    }
   
}