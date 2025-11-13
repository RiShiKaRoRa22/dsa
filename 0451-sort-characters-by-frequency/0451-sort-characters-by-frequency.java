class Solution {
    public String frequencySort(String s) {

        Map<Character,Integer> map= new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer> list= new ArrayList<>();
        for(int i: map.values()){
            list.add(i);
        }
        Collections.sort(list);

        StringBuilder sb= new StringBuilder();
        for(int i :list){
            char c=' ';
            for(char a: map.keySet()){
                if(map.get(a)==i){
                    c=a;
                    break;

                }
            }
            int j=0;
            while(j<i){
                sb.insert(0,c);
                j++;
            }
            map.remove(c);
        }
   
        return sb.toString();
    }
}