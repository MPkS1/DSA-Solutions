class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0,count=0;
        for(int i:nums)
        {
            sum+=i;
            if(hm.containsKey(sum-goal))
            {
                count+=hm.get(sum-goal);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}