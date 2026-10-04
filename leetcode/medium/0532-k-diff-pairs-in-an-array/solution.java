class Solution {
    public int findPairs(int[] nums,int k) {
        Arrays.sort(nums);
        int l=0,r=1,c=0;
        while(l<nums.length&&r<nums.length) {
            if(l==r) {
                r++;
                continue;
            }
            int diff=nums[r]-nums[l];
            if(diff==k) {
                c++;
                int x=nums[l];
                int y=nums[r];
                while(l<nums.length&&nums[l]==x)
                    l++;
                while(r<nums.length&&nums[r]==y)
                    r++;
            }
            else if(diff<k)
                r++;
            else
                l++;
        }
        return c;
    }
}