class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol=new ArrayList<>();
        List<Map<Character,Integer>> map=new ArrayList<>();
        for(String s:strs){
            boolean flag=false;
            Map<Character,Integer> cur=new HashMap<>();
            for(Character c:s.toCharArray()){
                cur.put(c,cur.getOrDefault(c,0)+1);
            }
            for(int i=0;i<map.size();i++){
                if(map.get(i).equals(cur)) {
                    sol.get(i).add(s);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                map.add(cur);
                List<String> l=new ArrayList<>();
                l.add(s);
                sol.add(l);
            }
        } 
        return sol;      
    }
}
