class Solution {
    public int uniqueElement(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int value:map.keySet()){
            if(map.get(value)%k!=0){
                return value;
            }
        }
        return -1;
        
    }
}