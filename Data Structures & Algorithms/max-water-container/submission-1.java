class Solution {
    public int maxArea(int[] heights) {
        //Maximum water:min(l,r)*(l-r)
        int l=0;
        int r=heights.length-1;
        int best=0;
        while(l<r){
           best=Math.max(best,(r-l)*Math.min(heights[l],heights[r]));
            if(heights[r]<heights[l])r--;
            else l++;
        }
        return best;
    }
}
