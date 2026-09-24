class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reversearr(arr,0,d-1);
        reversearr(arr,d,n-1);
        reversearr(arr,0,n-1);
    }
    public void reversearr(int[] a,int i,int j)
    {
        while(i<j)
        {
            int t=a[j];
            a[j]=a[i];
            a[i]=t;
            i++;
            j--;
        }
    }
}