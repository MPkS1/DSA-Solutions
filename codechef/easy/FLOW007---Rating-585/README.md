# FLOW007 - Rating 585

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T10:16:23.327Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int r=sc.nextInt();
            if(r<51)
            {
                System.out.println("LEFT");
            }
            else
            {
                System.out.println("RIGHT");
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW007)