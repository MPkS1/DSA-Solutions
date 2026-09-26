class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;

        for (int i : nums) {
            int cd = (int)Math.log10(i) + 1;

            if (cd % 2 == 0)
                c++;
        }

        return c;
    }
}