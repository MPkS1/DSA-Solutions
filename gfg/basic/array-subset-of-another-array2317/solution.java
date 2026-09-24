
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:b)
            hm.put(i,hm.getOrDefault(i,0)+1);
        for(int i:a)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)-1);
                if(hm.get(i)==0)
                    hm.remove(i);
            }
        }
        return hm.size()==0;
    }
}
