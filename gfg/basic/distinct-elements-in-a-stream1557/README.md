# Distinct in a Stream with Insertions and Deletions

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of integers  **arr[]**, the task is to return the no of distinct elements in subarray  **arr[0, i]**  for  **0**  <=  **i** < **arr.size()**. The array will have positive and negative values. positive value means you have to append it into your data and negative value means you have to remove it from your data.
 **Note:**  If the element is not present in the data and you get the -ve of that element then no changes should occur.

 **Examples:** 

```
Input: arr[] = [5, 5, 7, -5, -7, 1, 2, -2]
Output: [1, 1, 2, 2, 1, 2, 3, 2]
Explanation: Proper adding and removal of intgers will give this output.

```

```
Input: arr[] = [9, 9, 3, -9, -3, -9]
Output: [1, 1, 2, 2, 1, 0]
Explanation: Proper adding and removal of intgers will give this output.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:15:40.878Z  

```java
class Solution{
    public List<Integer> getDistinct(int[] arr){
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
            }else if(arr[i]<0){
                int x=-arr[i];
                if(hs.containsKey(x)){
                    hs.put(x,hs.get(x)-1);
                    if(hs.get(x)==0){
                        hs.remove(x);
                    }
                }
            }
            al.add(hs.size());
        }
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/distinct-elements-in-a-stream1557/1)