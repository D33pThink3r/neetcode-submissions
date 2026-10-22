class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b)->{
            return Integer.compare(a,b);
        });
        for(int i:nums){
            minHeap.offer(i);
            if(minHeap.size()>k)minHeap.poll();
        }
        return minHeap.peek();

    }
}
