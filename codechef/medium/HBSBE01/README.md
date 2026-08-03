# HBSBE01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef Assign Cookies

Chef has a group of children, each with a certain greed factor $childrenGreedFactors$ representing the minimum size of a cookie that would make them content.
Chef also has a collection of cookies, each with a specific size $cookieSizes$. Chef wants to distribute at most one cookie to each child such that the cookie size is at least the child's greed factor.
Help Chef find the maximum number of children who can be content by appropriately assigning cookies.

## Function Declaration
### Function Name

$findMaxContentChildren$ - This function determines the maximum number of children who can be content with the given cookies based on their greed factors.

### Parameters
- $childrenGreedFactors$ : A list of integers representing each child's minimum greed factor required to be content.
- $cookieSizes$: A list of integers representing the sizes of available cookies.
### Return Value
- Returns a number representing the maximum number of children that can be content.
- The output is a single integer indicating how many children can be assigned cookies meeting or exceeding their greed factors.
## Constraints
- $1 \leq \text{length}(childrenGreedFactors) \leq 3 \times 10^4$
- $0 \leq \text{length}(cookieSizes) \leq 3 \times 10^4$
- $1 \leq childrenGreedFactors[i], cookieSizes[j] \leq 2^{31} - 1$

 **The input and output formats given below are only if you want to test using custom inputs.** 

### Input Format
- The first line contains a single integer $T$ — the number of test cases.
- Each test case contains: The first line contains comma separated integers in []— the greed factors of the children ($childrenGreedFactors$). The second line contains comma separated integers in [] integers — the sizes of the cookies ($cookieSizes$).
### Output Format
- For each test case, print a single line containing one integer — the maximum number of children that Chef can make content by distributing cookies accordingly.
### Sample 1:
Input
Output

```
2
[1, 2, 2, 3]
[1, 1]
[1, 2, 2, 3, 4]
[1, 2, 3]
```

```
1
3
```

### Explanation:
- For the first test case, cookies = [1,2,2,3], children = [1,1]. Assign cookie 1 to child 1 and no other child would be content with the remaining cookies so answer is $1$.
- For the second test case, cookies = [1,2,2,3,4], children = [1,2,3]. Assign cookies 1, 2, and 3 to children 1, 2, and 3 respectively. Total assigned = 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T13:26:54.069Z  

```java
static int findMaxContentChildren(List<Long>children,List<Long>cookies){
    Collections.sort(children);
    Collections.sort(cookies);
    int i=0,j=0,ans=0;
    while(i<children.size()&&j<cookies.size()){
        if(cookies.get(j)>=children.get(i)){
            ans++;
            i++;
            j++;
        }else{
            j++;
        }
    }
    return ans;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HBSBE01)