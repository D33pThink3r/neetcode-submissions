class Solution {
    public int maxProfit(int[] prices) {
         int best=0;
         int n=prices.length;
         int min=prices[0];
        for(int i=1;i<n;i++){
            int cur=prices[i]-min;
            best=Math.max(cur,best);
            min=Math.min(min,prices[i]);
        }
        return best;
         
    }
}
