# LPYAS123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T02:51:39.483Z  

```py
n = int(input())
# Update the code below this line
def fibona(n):
    if(n<=0):
        return []
    elif n==1:
        return [0]
    se=[0,1]
    for i in range(2,n):
        n=se[-1]+se[-2]
        se.append(n)
    for i in se:
        print(i,end=" ")
    return False
    
fibona(n)
```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS123)