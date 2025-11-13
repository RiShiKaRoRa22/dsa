class Solution {
    public int romanToInt(String s) {
        int sum=0;
        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char arr[]= s.toCharArray();
        int len= arr.length;
        int i=0;
        for(i=len-1;i>0;i--){
            if(map.get(arr[i-1])<map.get(arr[i])){
                sum=sum+ (map.get(arr[i])-map.get(arr[i-1]));
                i--;
            }
            else{
                sum= sum+map.get(arr[i]);
            }

        }
        if(i!=-1){
            return sum+map.get(arr[0]);
        }
        return sum;
        

        
    }
}