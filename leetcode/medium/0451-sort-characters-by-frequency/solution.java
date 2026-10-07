class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray())
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Character> l=new ArrayList<>(hm.keySet());
        l.sort((a,b)->hm.get(b)-hm.get(a));
        for(char c:l)
        {
            for(int i=0;i<hm.get(c);i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}