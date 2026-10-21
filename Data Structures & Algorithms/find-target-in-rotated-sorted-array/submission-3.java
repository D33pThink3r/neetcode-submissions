class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        //Finding the cut 
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]<nums[r])r=mid;
            else l=mid+1;
        }
        //First Binary Search
        int l1=0;
        int r1=l-1;
        while(l1<=r1){
            int mid=(l1+r1)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target)l1=mid+1;
            else r1=mid-1;
        }
        //Second Binary Search
        int l2=l;
        int r2=n-1;
        while(l2<=r2){
            int mid=(l2+r2)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target)l2=mid+1;
            else r2=mid-1;
        }
        return -1; 
    }
}
