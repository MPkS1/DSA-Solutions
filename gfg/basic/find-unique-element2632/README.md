# Find unique element

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr** [] and an integer  **k**. Every element in the array appears a number of times that is a multiple of k, except for one element whose frequency is not a multiple of k. Find and return that unique element.

 **Examples:** 

```
Input: arr[] = [6, 2, 5, 2, 2, 6, 6], k = 3
Output: 5
Explanation: Every element appears 3 times except 5.
```

```
Input: arr[] = [2, 2, 2, 10, 2], k = 4
Output: 10
Explanation: Every element appears 4 times except 10.
```

 **Constraints:** 
3 ≤ |arr| ≤ 2*105
2 ≤  k ≤ 2*105
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T12:30:10.571Z  

```java
class Solution {
    public int uniqueElement(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int value:map.keySet()){
            if(map.get(value)%k!=0){
                return value;
            }
        }
        return -1;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-element2632/1)