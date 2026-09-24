class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i+=2)
            l.add(arr[i]);
        return l;
    }
}