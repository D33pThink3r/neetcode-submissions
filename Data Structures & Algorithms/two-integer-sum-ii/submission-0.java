class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int sol[]=new int[2];
        int l=0;
        int r=n-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                sol[0]=l+1;
                sol[1]=r+1;
                break;
            }
            else if(numbers[l]+numbers[r]>target)r--;
            else l++;
        }
        return sol;
    }
}
