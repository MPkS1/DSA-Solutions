class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0,count=0,cc=0,even=0;
        while(j<nums.length)
        {
            if(nums[j]%2!=0)
            {
                cc++;
                even=0;
            }
            j++;
            while(cc==k)
            {
                even++;
                if(nums[i]%2!=0)
                {
                    cc--;
                }
                i++;
            }
            count+=even;
        }
        return count;
    }
}