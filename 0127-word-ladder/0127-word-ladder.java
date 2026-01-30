class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //build graph
        if(!wordList.contains(endWord)){
            return 0;
        }

        //Queue<String> q= new LinkedList<>();
        Set<String> set= new HashSet<>();
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(int i=0;i<wordList.size();i++){
            String s=wordList.get(i);
            map.putIfAbsent(s, new ArrayList<>());
            int k=i+1;
            while(k<wordList.size()){
                if(differsByOne(s,wordList.get(k))){
                    map.get(s).add(wordList.get(k));
                    map.putIfAbsent(wordList.get(k),new ArrayList<>());
                    map.get(wordList.get(k)).add(s);
                }
                k++;

            }
        }

        int count=Integer.MAX_VALUE;
        for(String word:wordList){
            if(differsByOne(beginWord,word)){
                count=Math.min(count,bfs(map,word,endWord));
            }

        }
        return count==Integer.MAX_VALUE?0:count+1;    
    }

    public int bfs(Map<String,ArrayList<String>> graph,String start,String endWord){
        Queue<String> q= new LinkedList<>();
        Set<String> visited= new HashSet<>();
        int cnt=1;
        q.offer(start);
        visited.add(start);
        while(!q.isEmpty()){
            int k= q.size();
            
            
            for(int i=0;i<k;i++){
                String s=q.poll();
                if(s.equals(endWord)){
                    return cnt;
                }

                for(String str:graph.get(s)){
                    if(!visited.contains(str)){
                        q.offer(str);
                        visited.add(str);
                    }  
                }
            }
            cnt++;
            
        }
        return Integer.MAX_VALUE;


    }

    public boolean differsByOne(String f, String s){
        int cnt=0;
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)!=s.charAt(i)){
                cnt++;
            }
        }
        return cnt==1;
    }
}