# Partition Into 4 with Min Sum Diff

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an array  **arr[]**, partition it into four non-empty contiguous subarrays  **P**,  **Q**,  **R**, and  **S**. Let the sums of these subarrays be  **W**,  **X**,  **Y**, and  **Z**, respectively. Find the minimum possible value of max(W, X, Y, Z) - min(W, X, Y, Z) over all valid partitions.

 **Examples:** 

```
Input: arr[] = [4, 2, 2, 5, 1]
Output: 4
Explanation: The partition is P = [4],  Q = [2, 2],  R = [5],  and S = [1]. The corresponding sums are W = 4, X = 4, Y = 5, and Z = 1. Therefore, the required difference is max(W, X, Y, Z) - min(W, X, Y, Z) = 5 - 1 = 4.
```

```
Input: arr[] = [4, 4, 4, 4]
Output: 0
Explanation: There is only one valid way to partition the array: P = [4], Q = [4], R = [4], and S = [4]. The sums are W = X = Y = Z = 4. Therefore, the required difference is max(W, X, Y, Z) - min(W, X, Y, Z) = 4 - 4 = 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T12:29:20.883Z  

```java
class Solution {
    public long minDifference(int[] arr) {
        int n=arr.length;
        long[] pre=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++)
            pre[i]=pre[i-1]+arr[i];
        long total=pre[n-1];
        long ans=Long.MAX_VALUE;
        for(int j=1;j<n-2;j++) {
            long leftSum=pre[j];
            int i=lowerBound(pre,0,j-1,leftSum/2);
            int k=lowerBound(pre,j+1,n-2,(total+leftSum)/2);
            for(int x=Math.max(0,i-1);x<=Math.min(j-1,i+1);x++) {
                for(int y=Math.max(j+1,k-1);y<=Math.min(n-2,k+1);y++) {
                    long W=pre[x];
                    long X=pre[j]-pre[x];
                    long Y=pre[y]-pre[j];
                    long Z=total-pre[y];
                    long max=Math.max(Math.max(W,X),Math.max(Y,Z));
                    long min=Math.min(Math.min(W,X),Math.min(Y,Z));
                    ans=Math.min(ans,max-min);
                }
            }
        }
        return ans;
    }
    private int lowerBound(long[] pre,int l,int r,long target) {
        while(l<=r) {
            int mid=l+(r-l)/2;
            if(pre[mid]>=target)
                r=mid-1;
            else
                l=mid+1;
        }
        return l;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/partition-the-array--170647/1)