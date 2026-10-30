class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i< numRows; i++){
            rows[i] = new StringBuilder();
        }
        int currentrow = 0;
        int direction = 1;

        for(int i = 0; i<s.length();i++){
            rows[currentrow].append(s.charAt(i));
            if(currentrow == 0){
                direction = 1;
            }else if(currentrow == numRows - 1){
                direction = -1;
            }
           currentrow += direction;
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < numRows; i++){
            result.append(rows[i]);
        }
        return result.toString();
        
    }
}