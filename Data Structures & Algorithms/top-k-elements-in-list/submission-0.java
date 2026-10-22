class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int sol[]=new int[k];
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> keys=new ArrayList<>(map.keySet());
        Collections.sort(keys,(a,b)->map.get(b).compareTo(map.get(a)));
        for(int i=0;i<k;i++){
            sol[i]=keys.get(i);
        }
        return sol;
    }
}
