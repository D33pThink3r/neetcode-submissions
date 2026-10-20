class Solution {
    public int characterReplacement(String s, int k) {
        int best=0;
        int l=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int r=l;r<n;r++){
            Character cc=s.charAt(r);
            map.put(cc,map.getOrDefault(cc,0)+1);                         
            while((r-l)+1-Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getValue()>k){
                Character c=s.charAt(l);
                map.put(c,map.get(c)-1);
                l++;
           }    
           best=Math.max(best,r-l+1);      
        }
        return best;   
    }
}
