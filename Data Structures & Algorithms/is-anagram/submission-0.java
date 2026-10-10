class Solution {
    public boolean isAnagram(String s, String t) {
    String first,second;
        if(s.length()>t.length()){
            first=s;
            second=t;
        }
        else {
            first=t;
            second=s;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(Character c:first.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Character c:second.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(Integer i:map.values()){
            if(i>0)return false;
        }
        return true;
    }
}
