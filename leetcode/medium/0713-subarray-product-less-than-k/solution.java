class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int i=0,pro=1,c=0;
        for(int j=0;j<nums.length;j++)
        {
            pro*=nums[j];
            while(pro>=k)
            {
                pro/=nums[i];
                i++;
            }
            c+=j-i+1;
        }
        return c;
    }
}