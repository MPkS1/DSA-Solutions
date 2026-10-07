class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0,m=0,mf=0;
        for(int j=0;j<s.length();j++)
        {
            char rc=s.charAt(j);
            hm.put(rc,hm.getOrDefault(rc,0)+1);
            mf=Math.max(mf,hm.get(rc));
            while((j-i+1)-mf>k)
            {
                char lc=s.charAt(i);
                hm.put(lc,hm.get(lc)-1);
                i++;
            }
            m=Math.max(m,j-i+1);
        }
        return m;
    }
}