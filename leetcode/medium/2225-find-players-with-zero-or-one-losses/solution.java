class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int[] i:matches)
        {
            hm.put(i[0],hm.getOrDefault(i[0],0));
            hm.put(i[1],hm.getOrDefault(i[1],0)+1);
        }

        List<List<Integer>> l=new ArrayList<>();
        l.add(new ArrayList<>());
        l.add(new ArrayList<>());

        for(int i:hm.keySet())
        {
            if(hm.get(i)==0)
                l.get(0).add(i);
            else if(hm.get(i)==1)
                l.get(1).add(i);
        }

        Collections.sort(l.get(0));
        Collections.sort(l.get(1));

        return l;
    }
}