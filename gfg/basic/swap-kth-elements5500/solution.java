
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int i=k-1,j=arr.size()-k;
        int t=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,t);
    }
}
