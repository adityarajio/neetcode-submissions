class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean isRowsValid = false;
        boolean isColumnsValid = false;
        boolean isSubBoxes = false;
        int rows = board.length;
        int columns =  board[0].length;
        boolean isRowsStop = false;

        for(int i = 0; i < rows; i++){
            List<Character> list = new ArrayList<>();
            for(int j = 0; j < columns; j++){
                if(board[i][j] == '.') continue;
                if(list.contains(board[i][j])){
                    isRowsStop = true;
                    break;
                }
                list.add(board[i][j]);
            }
            if(isRowsStop) break;
        }
        if(!isRowsStop){
            isRowsValid = true;
        }

        boolean isColumnsStop = false;
        for(int j = 0; j < columns; j++){
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < rows; i++){
                if(board[i][j]=='.') continue;
                if(list.contains(board[i][j])){
                    isColumnsStop = true;
                    break;
                }
                list.add(board[i][j]);
            }
            if(isColumnsStop) break;
        }

        if(!isColumnsStop){
            isColumnsValid = true;
        }
        
        boolean isSub = false;
        for(int startRow = 0; startRow < 9; startRow+=3){
            for(int startCol = 0; startCol < 9; startCol+=3){
                List<Character> list = new ArrayList<>();
                for(int row = startRow; row < startRow+3; row++){
                    for(int col = startCol; col <startCol+3; col++){
                        if(board[row][col] == '.') continue;
                        if(list.contains(board[row][col])){
                            isSub = true;
                            break;
                        }
                        list.add(board[row][col]);
                    }
                    if(isSub) break;
                }
                if(isSub) break;
            }
            if(isSub) break;
        }

        if(!isSub){
            isSubBoxes = true;
        }


        if(isRowsValid && isColumnsValid && isSubBoxes){
            return true;
        }else{
            return false;
        }
    }
}
