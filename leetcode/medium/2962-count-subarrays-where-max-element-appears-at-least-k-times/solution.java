class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=0;
        for(int i:nums)
            max=Math.max(max,i);
        int i=0,c=0;
        long res=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==max)
                c++;
            while(c>=k)
            {
                if(nums[i]==max)
                    c--;
                i++;
            }
            res+=i;
        }
        return res;
    }
}