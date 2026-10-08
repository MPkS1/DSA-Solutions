class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cs=0,mc=0;
        hm.put(0,1);
        for(int i:nums)
        {   cs+=i;
            if(hm.containsKey(cs-k))
            {
                mc+=hm.get(cs-k);
            }
            hm.put(cs,hm.getOrDefault(cs,0)+1);
        }
        return mc;
    }
}