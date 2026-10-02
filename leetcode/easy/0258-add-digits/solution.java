class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>9)
        {
            int n=num,sum1=0;
            while(n>0)
            {
                int n1=n%10;
                sum1+=n1;
                n=n/10;
            }
            num=sum1;

        }
        return num;
    }
}