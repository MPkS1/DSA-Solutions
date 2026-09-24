class Solution {
    public int coin(int[] arr) {
        // code here
        int n=arr.length-1;
        if(n==0)
            return arr[0];
        if(n==1)
            return Math.min(arr[0],arr[1]);
        int i=0,j=n;
        while(i<j)
        {
            if(arr[i]>arr[j])
                i++;
            else
                j--;
        }
        return arr[i];
    }
}