class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res=new LinkedList<String>();
        for(String s:transactions)
        {
            String sa[]=s.split(",");
            System.out.println(sa[1]);
        }
        return res;
    }
}