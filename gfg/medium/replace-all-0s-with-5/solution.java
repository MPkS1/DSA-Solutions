class Solution {
    public int convertFive(int n) {
        String s=String.valueOf(n);
        String res="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='0')
                res=res+"5";
            else
                res=res+s.charAt(i);
        }
        return Integer.parseInt(res);
    }
}