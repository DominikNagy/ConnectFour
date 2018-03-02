package core;

import java.util.Formatter;

public class Field {

    private final Tile[][] tiles;
    private final int columnCount;
    private final int rowCount;

    public Field(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.tiles = new Tile[rowCount][columnCount];

        generate();
    }

    private void generate() {
        fillWithEmpty();
    }

    private void fillWithEmpty() {
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColumnCount(); j++) {
                if(tiles[i][j] == null) {
                    tiles[i][j] = new Empty();
                }
            }
        }
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public Tile getTile(int row, int column) {
        return tiles[row][column];
    }

    @Override
    public String toString() {
        Formatter sb = new Formatter();

        for (int row = 0; row < rowCount; row++) {

            for (int column = 0; column < columnCount; column++) {
                final Tile tile = getTile(row, column);
                sb.format("%3s", tile);
            }

            sb.format("\n");
        }

        return sb.toString();
    }
}
