package be.pxl.generics.opgave2;

public class ChessPiece implements Moveable<ChessBoardLocation> {
    private ChessBoardLocation chessBoardLocation;

    @Override
    public void move(ChessBoardLocation location) {
        this.chessBoardLocation = location;
    }

    @Override
    public ChessBoardLocation getCurrentLocation() {
        return this.chessBoardLocation;
    }
}
