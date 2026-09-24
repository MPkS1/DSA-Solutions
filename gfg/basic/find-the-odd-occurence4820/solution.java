class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int res=0;
        for(int i:arr)
            res=res^i;
        return res;
    }
}