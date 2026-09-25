class Solution {
    public String reverseSort(String s) {
        // code here
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=25;i>=0;i--){
            while(freq[i]>0){
                str.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return str.toString();
    }
}