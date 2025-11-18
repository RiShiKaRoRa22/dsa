class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==1){
            return true;
        }
        int j=0;
        int i=0;
        for(i=0;i<bits.length;i++){
            if(bits[i]==1 && (bits[i+1]==0 || bits[i+1]==1)){
                j=i+1;
                i++;
            }
        }
        if(i-j ==1){
            return false;
        }
        return true;
        
    }
}