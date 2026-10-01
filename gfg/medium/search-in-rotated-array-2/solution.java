class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        for(int i:arr)
        {
            if(i==key)
            {
                return true;
            }
        }
        return false;
    }
}
