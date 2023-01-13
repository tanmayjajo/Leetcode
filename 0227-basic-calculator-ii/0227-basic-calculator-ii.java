class Solution {
    public int calculate(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder num = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                
            }else if(ch <= 57 && ch >= 48){
                num.append(ch);
            }else if(ch == '+'){
                st.push(num.toString());
                st.push("+");
                num.delete(0, num.length());
                
            }else if(ch == '-'){
                st.push(num.toString());
                st.push("-");
                num.delete(0, num.length());
                
            }else if(ch == '*'){
                st.push(num.toString());
                num.delete(0, num.length());
                i++;
                ch = s.charAt(i);
                while(ch == ' ' || (ch <= 57 && ch >= 48)) {
                    if(i>=s.length()) break;
                    
                    if(ch != ' ') num.append(ch);

                    i++;
                    if(i < s.length())ch = s.charAt(i);
                    
                }
                i--;
                
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(num.toString());
                
                int c = a*b;
                num.delete(0, num.length());
                num.append(String.valueOf(c));
            }else if(ch == '/'){
                st.push(num.toString());
                num.delete(0, num.length());
                i++;
                ch = s.charAt(i);
                
                while(ch == ' ' || ch <= 57 && ch >= 48) {
                    if(i>=s.length()) break;
                    
                    if(ch != ' ') num.append(ch);
                    i++;
                    if(i < s.length()) ch = s.charAt(i);
                }
                i--;
                
                int a = Integer.valueOf(st.pop());
                int b = Integer.valueOf(num.toString());
                
                int c = a/b;
                num.delete(0, num.length());
                num.append(String.valueOf(c));
            }
        }
        st.push(num.toString());
                
        
        
        String[] arr = new String[st.size()];
        int i = arr.length-1;
        while(!st.isEmpty()){
            arr[i] = st.pop();
            i--;
        }
        
        int ans = Integer.valueOf(arr[0]);
        for(i =1; i < arr.length-1; i++){
            
            if(arr[i] == "+"){
                ans = ans + Integer.valueOf(arr[i+1]);
                i++;
            }else if(arr[i] == "-"){
                ans = ans - Integer.valueOf(arr[i+1]);
                i++;
            }
        }
        
        return ans;
    }
}