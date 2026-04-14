public class Pair<T,U>{
    public final T first;
    public final U second;

    public Pair(T first, U second){
        this.first= first;
        this.second=second;
    }

    //GENERICS- CLASS, PLACEHOLDER FOR VARS


}
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int start=0;
        int end=n;
        int[] result= new int[2];
        while(start<end){
            int midcol=(start+end)/2;
            Pair<Integer,Integer> peak= findPeak(midcol,mat);
            if(midcol-1>=0 && peak.first< mat[peak.second][midcol-1]){
                end=midcol;
            }
            else if(midcol+1<n && peak.first< mat[peak.second][midcol+1]){
                start=midcol+1;
            }
            else{
                result[0]=peak.second;
                result[1]=midcol;
                return result;

            }
        }
        return result;
        
    }

    public Pair<Integer,Integer> findPeak(int t, int[][] mat){
        int max=-1;
        int index=-1;
        for(int i=0;i<mat.length;i++){
           if( mat[i][t]>max){
            max=mat[i][t];
            index=i;
           }
        }
        return new Pair(max,index);
    }
}