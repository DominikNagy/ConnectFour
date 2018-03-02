package core;

public abstract class Tile {
    private TileState state = TileState.EMPTY;

    public TileState getState() {
        return state;
    }

    public void setState(TileState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.state == TileState.FILLED ? "-" : "M";
    }

}
