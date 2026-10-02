class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        backtrack(l,"",0,0,n);
        return l;
    }
    public static void backtrack(List<String> l,String s,int o,int c,int n)
    {
        if(s.length()==2*n)
        {
            l.add(s);
            return ;
        }
        if(o<n)
        {
            backtrack(l,s+"(",o+1,c,n);
        }
        if(c<o)
        {
            backtrack(l,s+")",o,c+1,n);
        }
    }
}