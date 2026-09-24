class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i=0,j=1;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[i]);
        while(j<arr.length)
        {
            if(arr[i]==arr[j])
            {
                j++;
                continue;
            }
            else
            {
                al.add(arr[j]);
                i=j;
                j++;
                
            }
        }
        return al;
    }
}
