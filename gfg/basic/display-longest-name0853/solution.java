class Solution {
    public String longest(String[] arr) {
        // code here
        int max=0;
        String s1="";
        for(String s:arr)
            if(max<s.length())
            {
                max=s.length();
                s1=s;
            }
        return s1;
    }
}