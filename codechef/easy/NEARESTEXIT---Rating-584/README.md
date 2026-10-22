# NEARESTEXIT - Rating 584

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T10:08:15.481Z  

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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<=b&&c<=b)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NEARESTEXIT)