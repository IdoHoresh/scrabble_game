package test;


public class Board {
    private Tile[][] GameBoard;
    private static Board singleBoard;

    private Board(){
        GameBoard = new Tile[15][15];
    }

    public static Board getBoard(){
        if(singleBoard == null){
            singleBoard = new Board();
        }
            return singleBoard;
    }

    public Tile[][] getTiles(){
       Tile[][] BoardCopy = new Tile[15][15];
       for (int i=0;i<15;i++){
           for (int j=0;i<15;i++){
               if (singleBoard.GameBoard[i][j]==null){
                   BoardCopy[i][j] = null;
               }else{
                   BoardCopy[i][j] = singleBoard.GameBoard[i][j];
               }
           }
       }
       return BoardCopy;
    }


    public boolean boardLegal(Word word) {
        Tile[][] CopyBoard = getTiles();
        int i = word.getRow();
        int j = word.getCol();
        boolean isBoardEmpty = CheckIfBoardEmpty(CopyBoard);
        if (isBoardEmpty) {
            if (word.isVertical()) {
                if (word.getCol() == 7) { // if the word is in the middle col
                    while (word.getTiles()[i] != null) {
                        if (i == 7) {
                            return true;
                        }
                    }
                }
            } else {
                if (word.getRow() == 7) {
                    while (word.getTiles()[j] != null) {
                        if (j == 7) {
                            return true;
                        }
                    }
                }

            }
        }


    return
    }

    public boolean CheckIfBoardEmpty(Tile[][] board){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                if(board[i][j]!=null){
                    return false;
                }
            }
        }
        return true;
    }

}
