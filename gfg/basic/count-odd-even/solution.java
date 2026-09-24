class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int e=0,o=0;
        for(int i:arr)
            if(i%2==0)
                e++;
            else
                o++;
        return new int[]{o,e};
    }
}