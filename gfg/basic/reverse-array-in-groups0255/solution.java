class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=k)
        {
            int l=i;
            int r=Math.min(n-1,i+k-1);
            while(l<r)
            {
                int t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
                r--;
            }
        }
    }
}