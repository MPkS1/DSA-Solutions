class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hs.contains(c))
                hs.remove(c);
            else 
                hs.add(c);
        }
        return hs.size()<=1?true:false;
    }
}