class Solution {
    int total=1;
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int sol[]=new int[nums.length];
        sol[0]=1;
        for(int i=1;i<n;i++)sol[i]=sol[i-1]*nums[i-1];
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            sol[i]*=postfix;
            postfix*=nums[i];
        }
        return sol;
    }
}  
