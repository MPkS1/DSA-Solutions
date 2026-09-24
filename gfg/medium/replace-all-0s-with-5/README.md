# replace-all-0s-with-5

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T07:17:29.028Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1)