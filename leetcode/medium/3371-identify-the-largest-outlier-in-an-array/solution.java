class Solution {
    public int getLargestOutlier(int[] nums) {
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            total += num;
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int answer = Integer.MIN_VALUE;

        for (int num : nums) {
            int outlier = total - 2 * num;

            if (map.containsKey(outlier)) {
                if (outlier != num || map.get(outlier) > 1) {
                    answer = Math.max(answer, outlier);
                }
            }
        }

        return answer;
    }
}