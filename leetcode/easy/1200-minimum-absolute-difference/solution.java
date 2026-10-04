class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> dl=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(min>Math.abs(arr[i+1]-arr[i]))
                min=Math.abs(arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i+1]-arr[i])==min)
                dl.add(Arrays.asList(arr[i],arr[i+1]));
        }
        return dl;
    }
}