class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i=0,min=Integer.MAX_VALUE,j=0,sum=0;
        while(j<arr.length)
        {
            sum+=arr[j];
            while(sum>x)
            {
                min=Math.min(min,j-i+1);
                sum-=arr[i];
                i++;
            }
                j++;
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}
