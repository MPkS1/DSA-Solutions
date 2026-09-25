class Solution{
    public List<Integer> getDistinct(int[] arr){
        HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
            }else if(arr[i]<0){
                int x=-arr[i];
                if(hs.containsKey(x)){
                    hs.put(x,hs.get(x)-1);
                    if(hs.get(x)==0){
                        hs.remove(x);
                    }
                }
            }
            al.add(hs.size());
        }
        return al;
    }
}