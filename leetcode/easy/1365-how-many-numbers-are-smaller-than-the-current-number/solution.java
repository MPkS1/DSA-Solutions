class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int c=0;
            for(int j:nums)
            {
                if(nums[i]>j)
                    c++;
                
            }
            res[i]=c;
        }
        return res;
    }
}