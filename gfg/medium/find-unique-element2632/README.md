# find-unique-element2632

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T10:40:41.664Z  

```java
class Solution {
    public int uniqueElement(int[] arr, int k) {
        // code here
        int res=0;
        for(int i=0;i<32;i++){
            int cnt=0;
            for(int num:arr){
                if(((num>>i)&1)==1)cnt++;
            }
            if(cnt%k!=0)res|=(1<<i);
        }
        return res;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-element2632/1)