/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            m.put(arr2[i],m.getOrDefault(arr2[i],0)+1);
        }
        Arrays.sort(arr1);
        ArrayList<pair> l=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int x=target-arr1[i];
            if(m.containsKey(x)){
                for(int j=0;j<m.get(x);j++){
                    l.add(new pair(arr1[i],x));
                }
            }
        }
        return l.toArray(new pair[0]);
    }
}