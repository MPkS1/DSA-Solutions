# Search Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two strings, a text string  **txt**  and a pattern string  **pat**, both consisting of lowercase English alphabets. Return the starting  **indices**  (0-based) of all the occurrences of the pattern string pat in the text string txt.

 **Note:** Return an empty list in case of no occurrences of pattern.

 **Examples:** 

```
Input: txt = "geeksforgeeks", pat = "geek"
Output: [0, 8]
Explanation: The string "geek" occurs twice in txt, one starts at index 0 and the other at index 8.

```

```
Input: txt = "abesdu", pat = "edu"
Output: []
Explanation: There's no substring "edu" present in txt.

```

```
Input: txt = "aabaacaadaabaaba", pat = "aaba"
Output: [0, 9, 12]
Explanation:

```

 **Constraints:** 
1 ≤ txt.size() ≤ 105
1 ≤ pat.size() ≤ txt.size()

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-03T13:24:23.162Z  

```java
class Solution {

    public static void computelps(String pat, int m, int lps[]) {
        int len = 0;
        lps[0] = 0;
        int i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    ArrayList<Integer> search(String pat, String text) {

        ArrayList<Integer> res = new ArrayList<>();

        int n = text.length();
        int m = pat.length();

        int[] lps = new int[m];
        computelps(pat, m, lps);

        int i = 0, j = 0;

        while (i < n) {

            if (pat.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                res.add(i - j);
                j = lps[j - 1];
            } else if (i < n && pat.charAt(j) != text.charAt(i)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/search-pattern0205/1)