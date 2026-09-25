class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:b){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>(hm.keySet());
        Collections.sort(al);
        return al;
    }
}