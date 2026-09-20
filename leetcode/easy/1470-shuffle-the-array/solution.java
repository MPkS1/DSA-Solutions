class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        for(int i=0,j=n,k=0;i<2*n-1;i++,j++,k++)
        {
            res[i]=nums[k];
            i++;
            res[i]=nums[j];
        }
        return res;
    }
}