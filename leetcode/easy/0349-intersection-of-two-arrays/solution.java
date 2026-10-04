class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums1)
            hs.add(i);
        for(int i:nums2)
        {
            if(hs.contains(i))
            {
                res.add(i);
            }
        }
        int n=hs.size();
        int[] arr=new int[n-1];
        int i=0;
        for(int j:res)
        {
            arr[i]=j;
            i++;
        }
        return arr;
    }

}