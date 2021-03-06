package algorithms.mazeGenerators;

public class Position  {
    private int RowIndex;
    private int ColumnIndex;

    /**
     * creates a Position
     * @param rowIndex - the value of the row location position
     * @param columnIndex - the value of the column location position
     */
    public Position(int rowIndex, int columnIndex) { //position can be anything, were checking if the pos on the board in diffrent function
        RowIndex = rowIndex;
        ColumnIndex = columnIndex;
    }

    /**
     * creates a Position from a string
     * @param rowIndexColumnIndex - formatted {rowValue,columnValue}
     */
    public Position(String rowIndexColumnIndex) { //position can be anything, were checking if the pos on the board in diffrent function
        int index1=rowIndexColumnIndex.indexOf(",");
        String row=rowIndexColumnIndex.substring(1,index1);
        int index2=rowIndexColumnIndex.indexOf("}", 1);
        String col=rowIndexColumnIndex.substring(index1+1,index2);
        RowIndex =Integer.parseInt(row) ;
        ColumnIndex =Integer.parseInt(col);
    }

    public boolean equals(int row, int col){
        return RowIndex==row && ColumnIndex==col;
    }

    public boolean isEqual( Position p){
        return this.ColumnIndex==p.ColumnIndex && this.RowIndex==p.RowIndex;
    }
 /**
  * setting new values of this position
  */
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

    /**
     * checks if position p diagonal to this position
     * @param p - the checked position
     * @return a boolean value - true if diagonal , else -false
     */
    public boolean posNotDiagonallyTo(Position p){

        if (p==null) return true;
        //TODO Throw Exceptions
        return RowIndex == p.getRowIndex() || ColumnIndex==p.getColumnIndex();
    }

    public String toString() {
        return "{"+RowIndex+","+ColumnIndex+"}";
    }

}
