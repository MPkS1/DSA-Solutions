import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++,k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}