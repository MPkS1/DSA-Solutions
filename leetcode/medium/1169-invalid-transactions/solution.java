class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res=new LinkedList<String>();

        for(int i=0;i<transactions.length;i++)
        {
            String sa[]=transactions[i].split(",");

            String name=sa[0];
            int time=Integer.parseInt(sa[1]);
            int amt=Integer.parseInt(sa[2]);
            String city=sa[3];

            boolean b=false;

            if(amt>1000)
                b=true;

            if(!b)
            {
                for(int j=0;j<transactions.length;j++)
                {
                    if(i==j)
                        continue;

                    String s1a[]=transactions[j].split(",");

                    String name1=s1a[0];
                    int time1=Integer.parseInt(s1a[1]);
                    String city1=s1a[3];

                    if(name1.equals(name) && !city.equals(city1) &&
                            Math.abs(time-time1)<=60)
                    {
                        b=true;
                        break;
                    }
                }
            }

            if(b)
                res.add(transactions[i]);
        }

        return res;
    }
}