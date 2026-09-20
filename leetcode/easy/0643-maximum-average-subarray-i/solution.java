class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0,avg=0;
        int i=0,j=k-1,sum=0;
        for(int l=0;l<k;l++)
            sum+=nums[l];
        max=(double)sum/k;
        while(j<nums.length-1)
        {
            sum-=nums[i++];
            sum+=nums[++j];
            avg=(double)sum/k;
            if(max<avg)
            {
                 max=avg;
            }   
            
        }
        return max;
    }
}