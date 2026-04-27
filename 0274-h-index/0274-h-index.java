class Solution {
    public int hIndex(int[] citations) {
        int h=citations.length;
        int i=0;
        Arrays.sort(citations);
        for(i=0;i<citations.length;i++){
            if(citations[i]<h){
                h--;
            }
            else{
                break;
            }

        }
        return citations.length-i;
        
    }
}