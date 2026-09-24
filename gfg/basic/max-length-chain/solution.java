class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int sum=0;
        if(arr.length<=2)
         return sum;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum-arr[0]-arr[arr.length-1];
    }
}