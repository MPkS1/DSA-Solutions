class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        boolean b=true;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                if(b)
                {
                    return isPal(i,j-1,s)||
                    isPal(i+1,j,s);
                }
            }
        }
        return true;
    }
    public static boolean isPal(int i,int j,String s)
    {
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}