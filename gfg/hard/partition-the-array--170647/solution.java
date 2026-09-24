class Solution {
    public long minDifference(int[] arr) {
        int n=arr.length;
        long[] pre=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
            pre[i]=pre[i-1]+arr[i];
        long total=pre[n-1];
        long ans=Long.MAX_VALUE;
        for(int j=1;j<n-2;j++) {
            long leftSum=pre[j];
            int i=lowerBound(pre,0,j-1,leftSum/2);
            int k=lowerBound(pre,j+1,n-2,(total+leftSum)/2);
            for(int x=Math.max(0,i-1);x<=Math.min(j-1,i+1);x++) {
                for(int y=Math.max(j+1,k-1);y<=Math.min(n-2,k+1);y++) {
                    long W=pre[x];
                    long X=pre[j]-pre[x];
                    long Y=pre[y]-pre[j];
                    long Z=total-pre[y];
                    long max=Math.max(Math.max(W,X),Math.max(Y,Z));
                    long min=Math.min(Math.min(W,X),Math.min(Y,Z));
                    ans=Math.min(ans,max-min);
                }
            }
        }
        return ans;
    }
    private int lowerBound(long[] pre,int l,int r,long target) {
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(pre[mid]>=target)
                r=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}