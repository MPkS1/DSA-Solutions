class solution {
    ArrayList<Integer> uniqueNumbers(int l, int r) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=l;i<=r;i++){
            int n=i;
            boolean[] used=new boolean[10];
            boolean unique=true;
            while(n>0){
                int digit=n%10;
                if(used[digit]){
                    unique=false;
                    break;
                }
                used[digit]=true;
                n/=10;
            }
            if(unique){
                al.add(i);
            }
        }
        return al;
    }
}