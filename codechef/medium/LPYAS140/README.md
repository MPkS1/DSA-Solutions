# LPYAS140

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Develop a function to compute and return the area of a rectangle, given its length and width

### Sample 1:
Input
Output

```
5 8
```

```
40
```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T02:55:13.952Z  

```py
def calculate_area(length, width):
    # Write your code here
    return length*width
    
    
def main():
    length, width = map(int, input().split())
    area = calculate_area(length, width)
    print(area)


main()

```

---

[View on CodeChef](https://www.codechef.com/problems/LPYAS140)