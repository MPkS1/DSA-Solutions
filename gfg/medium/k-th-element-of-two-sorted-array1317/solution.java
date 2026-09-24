class Solution {
    public int kthElement(int a[], int b[], int k) {
        int i=0,j=0,ele=0;
        for(int c=0;c<k;c++) {
            if(i<a.length && (j>=b.length || a[i]<=b[j])) {
                ele=a[i];
                i++;
            }
            else {
                ele=b[j];
                j++;
            }
        }
        return ele;
    }
}