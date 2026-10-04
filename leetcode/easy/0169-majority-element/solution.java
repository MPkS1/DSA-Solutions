class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maj=0;
        if(nums.length==1)
            return nums[0];
        for(int i:nums)
        {
            if(hm.containsKey(i)&&hm.get(i)>=(nums.length/2))
            {
                maj=i;
                break;
            }
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return maj;
    }
}