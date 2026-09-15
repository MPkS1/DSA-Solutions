class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-3;i++)
        {
            sum+=nums[i];
        }
        if(sum==nums[nums.length-2])
        {
            return nums[nums.length-2];
        }
        return nums[nums.length-1];
    }
}