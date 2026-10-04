class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int r=0;
        for(int i:nums)
        {
            if(hs.contains(i))
            {
                r=i;
                break;
            }
            hs.add(i);
        }
        return r;
    }
}