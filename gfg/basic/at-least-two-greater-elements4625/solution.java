class Solution {
    public long[] findElements(long arr[]) {
        long[] res=new long[arr.length-2];
        Arrays.sort(arr);        
        for(int i=0;i<arr.length-2;i++)
            res[i]=arr[i];
        return res;
    }
}