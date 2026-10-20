class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
          while(i>0 && i<n-1 && nums[i]==nums[i-1])i++;
          int l=i+1;
          int r=n-1;
            while(l<r){
                if(-nums[i]==nums[l]+nums[r]){
                    List<Integer> li=new ArrayList<>(List.of(nums[l],nums[i],nums[r]));
                    sol.add(li);
                l++;
                r--;
                while(l>0 && l<r && nums[l]==nums[l-1])l++;
                while(r>0 && r<=n-1 && nums[r]==nums[r+1])r--;
                }
                else if(-nums[i]<nums[l]+nums[r]) r--;
                else l++;
            }
        }
        return sol;
    }
}
