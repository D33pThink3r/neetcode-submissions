class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int i:piles) r=Math.max(r,i);
        int best=r;
        while(l<r){
            int mid=(l+r)/2;
            if(canEat(piles,h,mid)){
                best=mid;
                r=mid;
            }
            else l=mid+1;
        } 
        return best;       
    }
    public boolean canEat(int[] piles, int h,int mid){
        int need=0;
        for(int i:piles){
            if(i%mid==0) need+=i/mid;
            else need+=(i/mid)+1;
        }
        return need<=h;
    }
}