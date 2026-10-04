class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int i=0,j=1,max=Integer.MIN_VALUE,c=0;
        while(i<nums.length-1&&j<nums.length)
        {
            while(nums[i]==nums[j]&&j<nums.length-1)
            {
                j++;
            }
            if(nums[j]-nums[i]==1)
            {
                if(c==0)
                {
                    c++;
                }
                c++;
                System.out.println(i+" "+j+" "+c);
            }
            else
            {
                if(max<c)
                {
                    max=c;
                }
            }
            i=j;
            j++;
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
}