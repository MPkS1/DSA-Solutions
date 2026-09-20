# Invalid Transactions

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A transaction is possibly invalid if:

- the amount exceeds $1000, or;
- if it occurs within (and including) 60 minutes of another transaction with the same name in a different city.

You are given an array of strings `transaction` where `transactions[i]` consists of comma-separated values representing the name, time (in minutes), amount, and city of the transaction.

Return a list of `transactions` that are possibly invalid. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output: ["alice,20,800,mtv","alice,50,100,beijing"]
Explanation: The first transaction is invalid because the second transaction occurs within a difference of 60 minutes, have the same name and is in a different city. Similarly the second one is invalid too.
```

 **Example 2:** 

```
Input: transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output: ["alice,50,1200,mtv"]

```

 **Example 3:** 

```
Input: transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output: ["bob,50,1200,mtv"]

```

 

 **Constraints:** 

- transactions.length <= 1000
- Each transactions[i] takes the form "{name},{time},{amount},{city}"
- Each {name} and {city} consist of lowercase English letters, and have lengths between 1 and 10.
- Each {time} consist of digits, and represent an integer between 0 and 1000.
- Each {amount} consist of digits, and represent an integer between 0 and 2000.

## Solution

**Language:** Java  
**Runtime:** 60 ms (beats 21.78%)  
**Memory:** 47.3 MB (beats 55.52%)  
**Submitted:** 2026-09-20T06:06:26.630Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/invalid-transactions/)