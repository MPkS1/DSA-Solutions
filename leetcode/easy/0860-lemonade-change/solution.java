class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] bi=new int[2];
        for(int i:bills)
        {
            if(i==5)
            {
                bi[0]++;
            }
            else if(i==10)
            {
                if(bi[0]>0)
                {
                    bi[0]--;
                    bi[1]++;
                }
                else 
                    return false;
            }
            else if(i==20)
            {
                if(bi[1]>0&&bi[0]>0)
                {
                    bi[1]--;
                    bi[0]--;
                }
                else if(bi[0]>2)
                {
                    bi[0]=bi[0]-3;
                }
                else 
                    return false;
            }
        }
        return true;
    }
}