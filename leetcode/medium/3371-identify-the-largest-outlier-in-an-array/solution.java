class Solution {
    public int getLargestOutlier(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-3;i++)
        {
            sum+=nums[i];
        }
        int ol1=nums.length-2;
        int ol2=nums.length-1;
        System.out.println(sum);
        return (sum==nums[ol1])?nums[ol2]:nums[ol1];
    }
}