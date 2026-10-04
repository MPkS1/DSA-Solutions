class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums1)
            hs.put(i,hs.getOrDefault(i,0)+1);
        for(int i:nums2)
        {
            if(hs.containsKey(i))
            {
                al.add(i);
                hs.put(i,hs.get(i)-1);
                if(hs.get(i)==0)
                    hs.remove(i);
            }
        }
        int[] a=new int[al.size()];
        int j=0;
        for(int i:al)
        {
            a[j++]=i;
        }
        return a;
    }
}