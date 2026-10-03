class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int oc=0;
        hm.put(0,1);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                oc++;
            }
            if(hm.containsKey(oc-k))
            {
                count+=hm.get(oc-k);
            }
            hm.put(oc,hm.getOrDefault(oc,0)+1);
        }
        return count;
    }
}
