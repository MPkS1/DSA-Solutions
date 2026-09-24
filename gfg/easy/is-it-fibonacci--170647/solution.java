class Solution {
    public int nthGeekyNumber(int n, int[] geekNum) {
        int k=geekNum.length;
        if(n<=k)
            return geekNum[n-1];

        int sum=0;
        for(int x:geekNum)
            sum+=x;

        int[] arr=new int[n];
        for(int i=0;i<k;i++)
            arr[i]=geekNum[i];

        for(int i=k;i<n;i++) {
            arr[i]=sum;
            sum+=arr[i];
            sum-=arr[i-k];
        }

        return arr[n-1];
    }
}