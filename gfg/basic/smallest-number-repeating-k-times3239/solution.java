class Solution {
    public int findDuplicate(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int min=Integer.MAX_VALUE;
        for(int value:map.keySet()){
            if(map.get(value)==k){
                min=Math.min(min,value);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
};