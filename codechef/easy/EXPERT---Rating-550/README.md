# EXPERT - Rating 550

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T07:11:03.758Z  

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
		    int sum=0;
		    for(int i=0;i<4;i++)
		    {
		        sum+=sc.nextInt();
		    }
		    if(sum==0)
		    {
		        System.out.println("IN");
		    }
		    else{
		        System.out.println("OUT");
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EXPERT)