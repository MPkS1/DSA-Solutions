class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int[] i:intervalList)
        {
            int j=i[0];
            hm.put(j,hm.getOrDefault(j,0)+1);
        }
        return intervalList.size()-hm.size();
    }
}