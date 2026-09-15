class Solution {
    public int getLargestOutlier(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int t=0;
        for(int n:nums)
        {
            t+=n;
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int ans=Integer.MIN_VALUE;
        for(int n:nums)
        {
            int outl=t-2*n;
            if(hm.containsKey(outl))
            {
                if(outl!=n||hm.get(n)>1)
                    ans=Math.max(outl,ans);
            }
        }
        return ans;
    }
}