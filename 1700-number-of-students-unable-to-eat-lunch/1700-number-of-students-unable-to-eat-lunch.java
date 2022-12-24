class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        
        int zeroStud = 0;
        int oneStud = 0;
        
        for(int i = 0; i < students.length; i++){
            if(students[i] == 0){
                zeroStud++;
            }
            if(students[i] == 1){
                oneStud++;
            }
        }
        
        for(int i = 0; i < sandwiches.length; i++){
           
            if(sandwiches[i] == 0){
                if(zeroStud == 0){
                    return oneStud;
                }
                zeroStud--;
            }
            if(sandwiches[i] == 1){
                if(oneStud == 0){
                    return zeroStud;
                }
                oneStud--;
            }
            
        }
        
        return 0;
    }
}