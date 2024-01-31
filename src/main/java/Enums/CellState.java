package Enums;

public enum CellState {
    HIT("X"),
    MISSED("*"),
    EMPTY ("o");
    private final String cellState;
    private CellState(String cellState) {
        this.cellState = cellState;
    }

    public String getCellState() {
        return cellState;
    }
}
