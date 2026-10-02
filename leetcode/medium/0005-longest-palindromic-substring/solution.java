class Solution {
    public String longestPalindrome(String ss) {
        int s=0,e=0;
        for(int i=0;i<ss.length();i++)
        {
            int len1=expand(ss,i,i);
            int len2=expand(ss,i,i+1);
            int len=Math.max(len1,len2);
            if(len>e-s)
            {
                s=i-(len-1)/2;
                e=i+len/2;
            }
        }
        return ss.substring(s,e+1);
    }
    public int expand(String s,int left,int right)
    {
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}