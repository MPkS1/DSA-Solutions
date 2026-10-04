class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i:nums)
        {
            int ind=Math.abs(i)-1;
            if(nums[ind]<0)
                result.add(Math.abs(i));
            else
            {
                nums[ind]=-nums[ind];
            }
        }
        return result;

    }
}