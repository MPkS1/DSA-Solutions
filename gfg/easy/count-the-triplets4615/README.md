# Triplets Where One is Sum of Other Two

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**, count the number of  **distinct** triplets (a, b, c) such that:

- a + b = c
- Each triplet is counted only once, regardless of the order of a and b.

 **Examples:** 

```
Input: arr[] = [1, 5, 3, 2]
Output: 2 
Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
```

```
Input: arr[] = [2, 3, 4]
Output: 0
Explanation: No such triplet exits in the given array.
```

```
Input: arr[] = [1, 2, 1, 1]
Output: 1
Explanation: Since we need to consider only distinct, we have only one triplet (1, 1, 2).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T12:25:45.259Z  

```java
class Solution {
    public int countTriplet(int arr[]) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr)
            hs.add(x);

        HashSet<String> seen=new HashSet<>();
        int count=0;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int sum=arr[i]+arr[j];
                if(hs.contains(sum)) {
                    int a=Math.min(arr[i],arr[j]);
                    int b=Math.max(arr[i],arr[j]);
                    String key=a+","+b+","+sum;
                    if(seen.add(key))
                        count++;
                }
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1)