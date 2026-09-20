class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int i = 0;
        int res = 0;

        for(int j = 0; j < nums.length; j++)
        {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);

            while(hm.size() > k)
            {
                hm.put(nums[i], hm.get(nums[i]) - 1);

                if(hm.get(nums[i]) == 0)
                    hm.remove(nums[i]);

                i++;
            }

            res = res + (j - i + 1);
        }

        return res;
    }
}