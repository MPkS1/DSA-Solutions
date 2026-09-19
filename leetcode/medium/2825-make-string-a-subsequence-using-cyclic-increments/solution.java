class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        while(i<str1.length()&&j<str2.length())
        {
            char cr=str1.charAt(i);
            char tar=str2.charAt(j);
            char ne=(char)((cr-'a'+1)%26+'a');
            if(cr==tar||ne==tar)
            {
                j++;
            }
            i++;
        }
        return j==str2.length();
    }
}