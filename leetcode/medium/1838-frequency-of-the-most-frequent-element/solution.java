class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long s=0;
        int l=0,ans=1;
        for(int r=0;r<nums.length;r++)
        {
            s+=nums[r];
            while((long)nums[r]*(r-l+1)-s>k)
            {
                s-=nums[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}