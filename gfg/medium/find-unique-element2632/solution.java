class Solution {
    public int uniqueElement(int[] arr, int k) {
        // code here
        int res=0;
        for(int i=0;i<32;i++){
            int cnt=0;
            for(int num:arr){
                if(((num>>i)&1)==1)cnt++;
            }
            if(cnt%k!=0)res|=(1<<i);
        }
        return res;
        
    }
}