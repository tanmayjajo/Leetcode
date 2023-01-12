class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        // first row is created here itself
        list.add(new ArrayList<Integer>(Arrays.asList(1)));
        helper(numRows, list);
        return list;
    }
    
    
    // point to be noted here is that every call of recursion is creating 
    // the row in inverse order
    
    // it means call of 5 will create row number 2, call of 4 will create row
    // number 3 and so on.. call of 2 will create row number 5 
    // then call of will simply return
    public void helper(int n, List<List<Integer>> list){
        if(n == 1) return;
        List<Integer> ls = new ArrayList<>();
        ls.add(1); // adding first 1 of the row
        
        int i = 1; // this pointer will go from 1st to second last index of a row
        int j = list.size(); // last index of a row, will always be 1
        
        while(j-i>0){
            // adding from above last and above next
            int a = list.get(j-1).get(i-1) + list.get(j-1).get(i);
            // System.out.println(ls);
            // adding the number into ls (a row)
            ls.add(a);
            // incrementing the counter
            i++;
        }
        
        ls.add(1); // adding last 1 of the row
        
        // adding the completed row into final list
        list.add(new ArrayList<Integer>(ls));
        // System.out.println(list);
        
        // recursion of rest of the rows
        helper(n-1, list);
    }
}