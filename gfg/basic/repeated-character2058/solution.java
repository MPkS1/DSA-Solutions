class Solution {
    char firstRep(String S) {
        // your code here
        LinkedHashMap<Character,Integer> hs=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(int i=0;i<S.length();i++)
        {
            if(hs.get(S.charAt(i))>1)
                return S.charAt(i);
        }
        return '#';
    }
}