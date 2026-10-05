class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;

        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);

            if(hm.get(c)>max)
                max=hm.get(c);
        }

        StringBuilder sb=new StringBuilder();

        while(max>0)
        {
            for(char c:hm.keySet())
            {
                if(hm.get(c)==max)
                {
                    for(int j=0;j<max;j++)
                    {
                        sb.append(c);
                    }
                }
            }

            max--;
        }

        return sb.toString();
    }
}