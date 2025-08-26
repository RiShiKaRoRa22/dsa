class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]= new int[26];
        int freq2[]= new int[26];
        int len=s1.length();

        for(char c: s1.toCharArray()){
            freq1[c-'a']++;
        }
        int j=0;
        int i=0;

        if(s1.length()>s2.length()){
            return false;
        }

        while(j<len){
            freq2[s2.charAt(j)-'a']++;
            j++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        else{
            while(j<s2.length()){
                 freq2[s2.charAt(i)-'a']--;
                 freq2[s2.charAt(j)-'a']++;
                if(Arrays.equals(freq2,freq1)){
                    return true;
                }
                i++;
                j++;

            }
           
        }
        return false;
        
        
        
    }
}