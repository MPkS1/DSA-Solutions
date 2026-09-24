
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int c=0;
        for(int i:arr)
        {
            if(i<=x)
                c++;
        }
        return c;
    }
}