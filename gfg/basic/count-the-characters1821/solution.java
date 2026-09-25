class Sol{
    int getCount(String s,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }else{
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                i=j;
                j++;
            }
        }
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        int count=0;
        for(int value:map.values()){
            if(value==k){
                count++;
            }
        }
        return count;
    }
}