class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(char c:s1.toCharArray())
        {
            if(c=='('||c=='['||c=='{')
                s.push(c);
            else
            {
                if(s.size()==0)
                    return false;
                else if(s.peek()=='('&&c==')')
                    s.pop();
                else if(s.peek()=='['&&c==']')
                    s.pop();
                else if(s.peek()=='{'&&c=='}')
                    s.pop();
                else
                    return false;
            }
        }
        return s.size()==0?true:false;
    }
}