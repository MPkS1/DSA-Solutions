# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 46.4 MB (beats 57.55%)  
**Submitted:** 2026-09-14T05:13:03.985Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dm=new ListNode(0);
        ListNode c=dm;

        int carry=0;
        while(l1!=null||l2!=null||carry!=0)
        {
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int s=x+y+carry;
            carry=s/10;
            int digit=s%10;
            c.next=new ListNode(digit);
            c=c.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;

        }
        return dm.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)