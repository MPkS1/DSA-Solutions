class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            if(arr[i]==i+1)
                al.add(i+1);
        return al;
    }
}
