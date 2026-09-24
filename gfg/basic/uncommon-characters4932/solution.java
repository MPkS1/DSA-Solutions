class Solution {
    String uncommonChars(String s1, String s2) {
        // code here
        StringBuilder sb=new StringBuilder();
        char ch='a';
        for(int i=0;i<26;i++)
        {
            char c=(char)(ch+i);
            if((s1.indexOf(c)!=-1) ^ (s2.indexOf(c)!=-1))
                sb.append(c);
        }
        return sb.toString();
    }
}