import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int l=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[l];
            for(int j=0;j<l;j++)
                a[j]=sc.nextInt();
            swapa(a,0,k);
            swapa(a,k,l);
            swapa(a,0,l);
            for(int h:a)
                System.out.print(h+" ");
            System.out.println();
        }
	}
	public static void swapa(int[] a,int i1,int k)
	{
	    int i2=i1,k1=k;
	    while(i1<k-1)
	    {
	        int temp=a[i1];
	        a[i1]=a[k-1];
	        a[k-1]=temp;
	        i1++;
	        k--;
	    }
	    
	}
}
