class Solution {
    public int missingNumber(int[] nums) {
        int[] dn=new int[nums.length+1];
        int dn1=0;
        for(int i:nums)
        {
            dn[i]=1;
        }
        for(int i=0;i<dn.length;i++)
        {
            if(dn[i]==0)
                dn1=i;
        }
        return dn1;
    }
}