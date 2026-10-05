class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String s:arr){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!hm.containsKey(key))
                hm.put(key,new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}