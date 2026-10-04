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
        int n=res.size();
        int[] arr=new int[n];
        int i=0;
        for(int j:res)
        {
            arr[i]=j;
            i++;
        }
        return arr;
    }

}