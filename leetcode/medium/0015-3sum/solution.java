class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> dl=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        while(i<arr.length-2) {
            if(i>0&&arr[i]==arr[i-1]) {
                i++;
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while(j<k) {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0) {
                    dl.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j<k&&arr[j]==arr[j+1])
                        j++;
                    while(j<k&&arr[k]==arr[k-1])
                        k--;
                    j++;
                    k--;
                }
                else if(sum<0)
                    j++;
                else
                    k--;
            }
            i++;
        }
        return dl;
    }
}