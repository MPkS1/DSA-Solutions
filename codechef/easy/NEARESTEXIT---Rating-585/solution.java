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
