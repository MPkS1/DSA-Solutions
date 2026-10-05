# Find Players With Zero or One Losses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `matches` where `matches[i] = [winneri, loseri]` indicates that the player `winneri` defeated player `loseri` in a match.

Return  *a list* `answer` *of size* `2` *where:* 

- answer[0] is a list of all players that have not lost any matches.
- answer[1] is a list of all players that have lost exactly one match.

The values in the two lists should be returned in  **increasing**  order.

 **Note:** 

- You should only consider the players that have played at least one match.
- The testcases will be generated such that no two matches will have the same outcome.

 

 **Example 1:** 

```
Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
Output: [[1,2,10],[4,5,7,8]]
Explanation:
Players 1, 2, and 10 have not lost any matches.
Players 4, 5, 7, and 8 each have lost one match.
Players 3, 6, and 9 each have lost two matches.
Thus, answer[0] = [1,2,10] and answer[1] = [4,5,7,8].

```

 **Example 2:** 

```
Input: matches = [[2,3],[1,3],[5,4],[6,4]]
Output: [[1,2,5,6],[]]
Explanation:
Players 1, 2, 5, and 6 have not lost any matches.
Players 3 and 4 each have lost two matches.
Thus, answer[0] = [1,2,5,6] and answer[1] = [].

```

 

 **Constraints:** 

- 1 <= matches.length <= 105
- matches[i].length == 2
- 1 <= winneri, loseri <= 105
- winneri != loseri
- All matches[i] are unique.

## Solution

**Language:** Java  
**Runtime:** 85 ms (beats 45.42%)  
**Memory:** 171.2 MB (beats 26.47%)  
**Submitted:** 2026-10-05T06:33:21.838Z  

```java
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int[] i:matches)
        {
            hm.put(i[0],hm.getOrDefault(i[0],0));
            hm.put(i[1],hm.getOrDefault(i[1],0)+1);
        }

        List<List<Integer>> l=new ArrayList<>();
        l.add(new ArrayList<>());
        l.add(new ArrayList<>());

        for(int i:hm.keySet())
        {
            if(hm.get(i)==0)
                l.get(0).add(i);
            else if(hm.get(i)==1)
                l.get(1).add(i);
        }

        Collections.sort(l.get(0));
        Collections.sort(l.get(1));

        return l;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-players-with-zero-or-one-losses/)