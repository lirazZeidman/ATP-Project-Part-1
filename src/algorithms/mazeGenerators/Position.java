package algorithms.mazeGenerators;

import org.jetbrains.annotations.NotNull;

public class Position  {
    private int RowIndex;
    private int ColumnIndex;

    public Position(int rowIndex, int columnIndex) { //position can be anything, were checking if the pos on the board in diffrent function
        RowIndex = rowIndex;
        ColumnIndex = columnIndex;
    }
    public boolean equals(int row, int col){
        return RowIndex==row && ColumnIndex==col;
    }

    public boolean equals(@NotNull Position p){
        return this.ColumnIndex==p.ColumnIndex && this.RowIndex==p.RowIndex;
    }

    public void setPosition(int rowIndex,int columnIndex){
        this.setRowIndex(rowIndex);
        this.setColumnIndex(columnIndex);
    }

    public void setRowIndex(int rowIndex) {
        RowIndex = rowIndex;
    }

    public void setColumnIndex(int columnIndex) {
        ColumnIndex = columnIndex;
    }

    public int getRowIndex() {
        return RowIndex;
    }

    public int getColumnIndex() {
        return ColumnIndex;
    }


    public boolean posNotDiagonallyTo(Position p){
        /**
         * False if they diagonal
         */
        if (p==null) return true;
        //TODO Throw Exceptions
        return RowIndex == p.getRowIndex() || ColumnIndex==p.getColumnIndex();
    }

    public String toString() {
        return "{"+RowIndex+","+ColumnIndex+"}";
    }

}
