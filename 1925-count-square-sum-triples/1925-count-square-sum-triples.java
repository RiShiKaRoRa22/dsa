class Solution {
    public int countTriples(int n) {
        int a=1;
        int b=1;
        int c=1;
        int count=0;
        for(c=1;c<=n;c++){
            for(b=1;b<c;b++){
                for(a=1;a<c;a++){
                    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                        count++;
                    }
                }
            }
        }
        return count;
        
        
    }
}