class Solution {
    public int kthDistinct(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                j++;
                if(j==k){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}