class Solution {
    int total=1;
    public int[] productExceptSelf(int[] nums) {
        int sol[]=new int[nums.length];
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<nums.length;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=nums[i+1]*right[i+1];
        }
        sol[0]=right[0];
        sol[nums.length-1]=left[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            sol[i]=left[i]*right[i];
        }
        return sol;
    }
}  
