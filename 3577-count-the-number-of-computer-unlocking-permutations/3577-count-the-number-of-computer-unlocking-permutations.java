class Solution {
    public int countPermutations(int[] complexity) {
        long count=1;
        long mod=(long)Math.pow(10,9)+7;
        for(int i=1;i<complexity.length;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
            count=(count*i)%mod;
        }
        return (int)count%(int)mod;

        
    }
}