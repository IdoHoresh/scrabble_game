package test;


import java.util.Arrays;
import java.util.Objects;

public class Word {
    private Tile[] tiles;
    private int row;
    private int col;
	private boolean vertical;

    public Word(Tile[] tiles,int row, int col , boolean vertical){
        if ((row>=0 && row<14)&&(col>=0 && col<14)) {
            this.tiles = tiles.clone();
            this.row = row;
            this.col = col;
            this.vertical = vertical;
        }else{
            return;
        }

    }

    public Tile[] getTiles() {
        return tiles;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isVertical() {
        return vertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return row == word.row && col == word.col && vertical == word.vertical && Objects.deepEquals(tiles, word.tiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(tiles), row, col, vertical);
    }
}
