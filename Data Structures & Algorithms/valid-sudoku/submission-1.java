class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int rows = board.length;
        int columns =  board[0].length;

        for(int i = 0; i < rows; i++){
            List<Character> list = new ArrayList<>();
            for(int j = 0; j < columns; j++){
                if(board[i][j] == '.') continue;
                if(list.contains(board[i][j])){
                    return false;
                }
                list.add(board[i][j]);
            }
        }

        for(int j = 0; j < columns; j++){
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < rows; i++){
                if(board[i][j]=='.') continue;
                if(list.contains(board[i][j])){
                    return false;
                }
                list.add(board[i][j]);
            }
        }

        for(int startRow = 0; startRow < 9; startRow+=3){
            for(int startCol = 0; startCol < 9; startCol+=3){
                List<Character> list = new ArrayList<>();
                for(int row = startRow; row < startRow+3; row++){
                    for(int col = startCol; col <startCol+3; col++){
                        if(board[row][col] == '.') continue;
                        if(list.contains(board[row][col])){
                            return false;
                        }
                        list.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }
}
