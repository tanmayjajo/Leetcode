class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<String>();
    
        fun(0, s, res, path);
        return res;
    }
    
    public void fun(int index, String s, List<List<String>> res, List<String> path){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        
        for(int i = index; i < s.length(); ++i){
            if(isPalin(s, index, i)){
                path.add(s.substring(index, i+1));
                fun(i+1,s,res,path);
                path.remove(path.size() - 1);
            }
        }
    }
    public boolean isPalin(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    
    
}