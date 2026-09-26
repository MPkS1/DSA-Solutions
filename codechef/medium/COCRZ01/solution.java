class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int[] i:intervalList)
        {
            int j=i[0],k=i[1];
            hm.put(j,k);
        }
        return intervalList.size()-hm.size();
    }
}