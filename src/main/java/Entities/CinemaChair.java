package Entities;

import Enum.CinemaRow;
import Enum.CinemaColumn;
public class CinemaChair {

    private CinemaRow row;
    private CinemaColumn column;
    private boolean isOccupied;

    public CinemaChair(CinemaRow row, CinemaColumn column) {
        this.row = row;
        this.column = column;
        isOccupied = false;
    }

    public CinemaRow getRow() {
        return row;
    }

    public void setRow(CinemaRow row) {
        this.row = row;
    }

    public CinemaColumn getColumn() {
        return column;
    }

    public void setColumn(CinemaColumn column) {
        this.column = column;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return row.getValue() + column.name() + (isOccupied ? "X" : " ");
    }
}
