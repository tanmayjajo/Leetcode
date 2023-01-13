class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        
        List<String> list = new ArrayList<>();
        
        helper(list, st, str, 2*n, n);
        
        return list;
    }
    
    public void helper(List<String> list, Stack<Character> st, StringBuilder str, int n, int count){
        if(n == 0){
            list.add(str.toString());
            return;
        }
        if(st.size() == 0) {
            st.push('(');
            str.append('(');
            
            helper(list, st, str, n-1, count -1);
            str.deleteCharAt(str.length() - 1);
            st.pop();
            return;
        }
        
        
        if(count>0){
            str.append('(');
            st.push('(');
            helper(list, st, str, n-1, count -1);
            st.pop();
            
            // System.out.println( "Before deleting" + str.toString());
            str.deleteCharAt(str.length() - 1);
            // System.out.println( "After deleting" +str.toString());
        }
        
        
        if(st.peek() == '('){
            str.append(')');
            st.pop();
            helper(list, st, str, n-1, count);
            st.push('(');
            str.deleteCharAt(str.length() - 1);
        
        }
        
    }
    
    
    
    
}