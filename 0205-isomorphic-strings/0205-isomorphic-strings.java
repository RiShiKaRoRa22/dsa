class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*Map<Character, Integer> map1= new HashMap<>();
        Map<Character, Integer> map2= new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        int[] map1vals= new int[map1.size()];

        int[] map2vals= new int[map2.size()];
        int i=0;
        for(int k: map1.values()){
            map1vals[i++]=k;
        }
        i=0;
        for(int k: map2.values()){
            map2vals[i++]=k;
        }
        //Arrays.sort(map1vals);
        //Arrays.sort(map2vals);
        for(int j=0;j<map1vals.length && j<map2vals.length;j++){
            if(map1vals[j]!=map2vals[j]){
                return false;
            }
        }
        
        return true; //Arrays.equals(map1vals,map2vals); */

        Map<Character,Character> map= new HashMap<>();
        char c1[]= s.toCharArray();
        char c2[]= t.toCharArray();


        for(int i=0;i<c1.length && i<c2.length;i++){
            map.put(c1[i],c2[i]);
        }

        Map<Character, Integer> map1= new HashMap<>();
        Map<Character, Integer> map2= new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.size()!=map2.size()){
            return false;
        }

        StringBuilder sb= new StringBuilder();

        for(char c:s.toCharArray()){
            sb.append(map.get(c));
        }

        return sb.toString().equals(t);


        
    }
}