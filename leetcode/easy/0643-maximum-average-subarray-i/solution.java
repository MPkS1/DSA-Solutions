class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0;
        int i=0,j=k-1,sum=0;
        for(int l=0;l<k;l++)
            sum+=nums[l];
        max=sum/k;
        while(j<nums.length-1)
        {
            sum-=nums[i++];
            sum+=nums[++j];
            if(sum/k>max)
            {
                 max=sum/k;
                System.out.println(max);
            }   
            
        }
        return max;
    }
}