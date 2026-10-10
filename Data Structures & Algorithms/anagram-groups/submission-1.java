class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character,Integer>,List<String>> map=new HashMap<>();
        for(String s:strs){
            boolean flag=false;
            Map<Character,Integer> cur=new HashMap<>();
            for(Character c:s.toCharArray()){
                cur.put(c,cur.getOrDefault(c,0)+1);
            }
            map.computeIfAbsent(cur,key->new ArrayList<>()).add(s);
        } 
        return new ArrayList<>(map.values())  ;   
    }
}