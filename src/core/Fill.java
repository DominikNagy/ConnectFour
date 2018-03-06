package core;

public class Fill extends Tile {

    @Override
    public String toString() {
        return (super.getState() == TileState.FILL) ?
                "[*] " : super.toString();
    }
}
