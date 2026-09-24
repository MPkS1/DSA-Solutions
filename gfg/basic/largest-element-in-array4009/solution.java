class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=0;
        for(int i:arr)
            max=Math.max(i,max);
        return max;
    }
}
