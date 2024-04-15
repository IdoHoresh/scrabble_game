package test;


import java.util.Objects;
import java.util.Random;

public class Tile {
    public final char letter;
    public final int score;

    private Tile(char letter, int score) {
        this.letter = letter;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter && score == tile.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, score);
    }


    public static class Bag{

        private int[] AmountOfTiles = new int[26];
        private Tile[] TilesIndex = new Tile[26];

        private void initialAmountOfTiles(int[] arr){
            arr[0]=9; //initializing the arr that counts the letters
            arr[1]=2;
            arr[2]=2;
            arr[3]=4;
            arr[4]=12;
            arr[5]=2;
            arr[6]=3;
            arr[7]=2;
            arr[8]=9;
            arr[9]=1;
            arr[10]=1;
            arr[11]=4;
            arr[12]=2;
            arr[13]=6;
            arr[14]=8;
            arr[15]=2;
            arr[16]=1;
            arr[17]=6;
            arr[18]=4;
            arr[19]=6;
            arr[20]=4;
            arr[21]=2;
            arr[22]=2;
            arr[23]=1;
            arr[24]=2;
            arr[25]=1;
        }

        private void initialTilesIndex(Tile[] t){
            t[0]=new Tile('A',1); //initializing the arr of the scores
            t[1]=new Tile('B',3);
            t[2]=new Tile('C',3);
            t[3]=new Tile('D',2);

            t[4]=new Tile('E',1);
            t[5]=new Tile('F',4);
            t[6]=new Tile('G',2);
            t[7]=new Tile('H',4);

            t[8]=new Tile('I',1);
            t[9]=new Tile('J',8);
            t[10]=new Tile('K',5);
            t[11]=new Tile('L',1);

            t[12]=new Tile('M',3);
            t[13]=new Tile('N',1);
            t[14]=new Tile('O',1);
            t[15]=new Tile('P',3);

            t[16]=new Tile('Q',10);
            t[17]=new Tile('R',1);
            t[18]=new Tile('S',1);
            t[19]=new Tile('T',1);

            t[20]=new Tile('U',1);
            t[21]=new Tile('V',4);
            t[22]=new Tile('W',4);
            t[23]=new Tile('X',8);

            t[24]=new Tile('Y',4);
            t[25]=new Tile('Z',10);

        }

        public Tile getRand(){
            Random rand = new Random();
            int randomNumber = rand.nextInt(25);
            if (AmountOfTiles.length==0){
                return null;
            }
            if(AmountOfTiles[randomNumber]!=0){
                AmountOfTiles[randomNumber]--;
                return TilesIndex[randomNumber];
            }else{
                return null;
            }
        }

        public int charToIndex(char c){ // converts char to index
            return (int)c - 65;
        }

        public Tile getTile(char c){
            int index = charToIndex(c);
            if(AmountOfTiles.length==0){
                return null;
            }
            if(AmountOfTiles[index]!=0){
                AmountOfTiles[index]--;
                return TilesIndex[index];
            }else{
                return null;
            }
        }


    }
}
