class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0,res=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            s+=(nums[i]==0)?-1:1;
            if(hm.containsKey(s))
            {
                res=Math.max(res,i-hm.get(s));
            }
            else
                hm.put(s,i);
        }
        return res;
    }
}