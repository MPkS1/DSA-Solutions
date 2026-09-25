# Smallest Repeating K Times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr**, the goal is to find out the smallest number that is repeated exactly ‘ **k** ’ times.

 **Note:**  If there is no such element then return  **-1**.

 **Example:** 

```
Input: arr[] = [2, 2, 1, 3, 1], k = 2
Output: 1
Explanation: 2 and 1 both appear exactly 2 times. Since we need to find the smallest, output is 1.
```

```
Input: arr[] = [3, 5, 3, 2], k = 1
Output:  2 
Explanation: 5 and 2 each appear exactly 1 time. Since we need the smallest, the output is 2.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:00:42.910Z  

```java
class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(int value:map.keySet()){
            if(map.get(value)==k){
                min=Math.min(min,value);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-repeating-k-times3239/1)