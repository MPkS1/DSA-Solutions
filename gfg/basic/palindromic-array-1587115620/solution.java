class Solution {
    public boolean isPalinArray(int[] arr) {
        for(int x:arr) {
            int n=x;
            int rev=0;
            while(x>0) {
                rev=rev*10+x%10;
                x/=10;
            }
            if(n!=rev)
                return false;
        }
        return true;
    }
}