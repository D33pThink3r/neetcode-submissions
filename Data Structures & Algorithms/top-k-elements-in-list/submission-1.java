class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int cur=0;
        int sol[]=new int[k];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> [] freq=new List[n+1];
        for(int i=0;i<n+1;i++){
            freq[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        for(int i=n;i>=1;i--){
            if(!freq[i].isEmpty()){
            for(int j=0;j<freq[i].size();j++){
                sol[cur]=freq[i].get(j);
                cur++;
                }
            }
            if(cur==k) break;
        }
        return sol;
    }
}
