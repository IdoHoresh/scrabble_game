package test;


public class Board {
    private int[][] GameBoard;
    private static Board singleBoard;

    private Board(){
        GameBoard = new int[15][15];
    }

    public static Board getBoard(){
        if(singleBoard == null){
            singleBoard = new Board();
        }
            return singleBoard;
    }

    public Tiles[][] getTiles(){

    }


    public boolean boardLegal(Word word){

    }

}
