class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0,rs=0;
        int p=0;
        for(int i=1;i<nums.length;i++)
        {
            rs+=nums[i];
        }
        while(p<nums.length-1)
        {
            if(ls==rs)
                return p;
            else
            {
                ls+=nums[p++];
                rs-=nums[p];
            }
        }
        if(ls==rs)
            return p;
        ls+=nums[p];
        rs-=nums[p];
        if(ls==rs)
            return p;
        return -1;
    }
}