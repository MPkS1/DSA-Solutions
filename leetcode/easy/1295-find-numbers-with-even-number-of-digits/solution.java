class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            int cd=1;
            while(i>9)
            {
                int r=i%10;
                i=i/10;
                cd++;
            }
            if(cd%2==0)
                c++;
        }
        return c;
    }
}