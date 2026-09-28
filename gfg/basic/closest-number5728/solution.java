class Solution {
    static int closestNumber(int n,int m) {
        m=Math.abs(m);
        int a=(n/m)*m;
        int b=n>=0?a+m:a-m;
        int x=Math.abs(n-a);
        int y=Math.abs(n-b);
        if(x<y)return a;
        if(y<x)return b;
        return Math.abs(a)>Math.abs(b)?a:b;
    }
}