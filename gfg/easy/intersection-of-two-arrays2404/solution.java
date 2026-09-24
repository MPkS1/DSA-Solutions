class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:a)
            hs1.add(i);
        for(int j:b)
            hs2.add(j);
        hs1.retainAll(hs2);

        return hs1.size();
    }
}