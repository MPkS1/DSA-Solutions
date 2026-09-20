import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] ch=A.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=A.length()-1;i>=0;i--)
            sb.append(ch[i]);
        if(A.equals(sb.toString()))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}



