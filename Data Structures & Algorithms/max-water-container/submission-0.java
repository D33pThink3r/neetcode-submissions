class Solution {
    public int maxArea(int[] heights) {
        //Maximum water:min(l,r)*(l-r)
        int n=heights.length;
        int l=0;
        int r=n-1;
        int best=0;
        while(l<r){
            int cur=(r-l)*Math.min(heights[l],heights[r]);
            best=Math.max(best,cur);
            if(heights[r]<heights[l])r--;
            else l++;
        }
        return best;
    }
}
