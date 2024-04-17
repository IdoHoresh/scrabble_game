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
       for (int i=0;i<14;i++){
           for (int j=0;i<14;i++){
               if (singleBoard.GameBoard[i][j]==null){
                   BoardCopy[i][j] = null;
               }else{
                   BoardCopy[i][j] = singleBoard.GameBoard[i][j];
               }
           }
       }
       return BoardCopy;
    }


    public boolean boardLegal(Word word){

    }

}
