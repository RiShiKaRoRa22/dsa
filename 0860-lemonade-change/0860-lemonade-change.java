class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        //int twenty=0;

        for(int i:bills){
            if(i==5){
                five++;   
            }
            
            else{
                if(i==10){
                    ten++;
                }
               
                int diff=i-5;
                if(diff==5){
                    if(five!=0){
                        five--;
                    }
                    else{
                        return false;
                    }
                }
                 
                else {
                    if(five!=0 && ten!=0){
                        ten--;
                        five--;
                    }
                    else if(five>2){
                        five=five-3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}