class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        int max=0,res=0;
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            hs.add(i);
            if(max<hm.get(i))
                max=hm.get(i);
        }
        for(int i:hs)
        {
            if(hm.get(i)==max)
            {
                res+=max;
            }
        }
        return res;
    }
}