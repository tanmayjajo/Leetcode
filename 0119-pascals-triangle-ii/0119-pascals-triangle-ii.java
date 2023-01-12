class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int numRows = rowIndex + 1;
        List<List<Integer>> list = new ArrayList<>();
     
        for(int i = 1; i < numRows+1; i++){
            
            List<Integer> ls = new ArrayList<>();
            ls.add(1);
            for(int j = 1; j < i-1; j++){
                if(j < i-1){
                    int a = list.get(i-2).get(j-1);
                    int b = list.get(i-2).get(j);
                    ls.add(a+b);
                }
            }
            if(i!=1) ls.add(1);
            list.add(new ArrayList<Integer>(ls));
        }
        
        return list.get(list.size() - 1);
        
    }
}