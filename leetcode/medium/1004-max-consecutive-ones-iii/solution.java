class Solution {
    public int longestOnes(int[] nums, int k) {
       int i=0,max=0,co=0;
       for(int j=0;j<nums.length;j++)
       {
            if(nums[j]==0)
                co++;
            while(co>k)
            {
                if(nums[i]==0)
                    co--;
                i++;
            }
            max=Math.max(max,j-i+1);
       } 
       return max;
    }
}