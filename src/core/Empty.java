package core;

public class Empty extends Tile {

    @Override
    public String toString() {
        return (super.getState() == TileState.EMPTY) ?
                "[ ] " : super.toString();
    }

}