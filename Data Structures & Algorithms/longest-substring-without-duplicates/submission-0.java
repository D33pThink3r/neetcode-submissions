class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int freq[]=new int[128];
        int l=0;
        int best=0;
        for(int r=l;r<n;r++){
            Character c=s.charAt(r);
            freq[c]++;
            while(freq[c]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            best=Math.max(best,r-l+1);
        }
        return best;
    }
}
