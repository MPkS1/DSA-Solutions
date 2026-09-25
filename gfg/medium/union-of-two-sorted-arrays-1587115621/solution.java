class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> hs1=new HashSet<>();
        for(int i:a)
            hs1.add(i);
        for(int i:b)
            hs1.add(i);
        ArrayList al=new ArrayList<Integer>(hs1);
        Collections.sort(al);
        return al;
        
    }
}
