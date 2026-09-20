class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0,sum=0;
        for(int[] i:accounts)
        {
            for(int j:i)
            {
                sum+=j;
            }
            if(max<sum)
                max=sum;
            sum=0;
        }
        return max;
    }
}