class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min=Integer.MAX_VALUE,max=0;
        for(int i:arr)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        return new ArrayList<Integer>(List.of(min,max));
    }
}
