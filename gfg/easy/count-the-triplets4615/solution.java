class Solution {
    public int countTriplet(int arr[]) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr)
            hs.add(x);

        HashSet<String> seen=new HashSet<>();
        int count=0;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int sum=arr[i]+arr[j];
                if(hs.contains(sum)) {
                    int a=Math.min(arr[i],arr[j]);
                    int b=Math.max(arr[i],arr[j]);
                    String key=a+","+b+","+sum;
                    if(seen.add(key))
                        count++;
                }
            }
        }
        return count;
    }
}