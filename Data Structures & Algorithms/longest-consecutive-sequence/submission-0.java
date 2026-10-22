class Solution {
    public int longestConsecutive(int[] nums) {
        int best=0;
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        // 2 20 4 10 3 5
        List<Integer> start=new ArrayList<>();
        for(int i:set){
            if(!set.contains(i-1))start.add(i);
        }
        // 20 10 5
        for(int i:start){
            int temp=i;
            int cur=1;
            while(set.contains(temp+1)){
                temp+=1;
                cur++;
            }
            best=Math.max(best,cur);
        }
        return best;
    }
}
