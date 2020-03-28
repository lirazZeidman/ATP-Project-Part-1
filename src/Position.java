public class Position {
    private int RowIndex;
    private int ColumnIndex;

    public Position(int rowIndex, int columnIndex) {
        RowIndex = rowIndex;
        ColumnIndex = columnIndex;
    }
    public boolean isEqual(int row, int col){
        return RowIndex==row && ColumnIndex==col;
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

    @Override
    public String toString() {
        return "{"+RowIndex+","+ColumnIndex+"}";
    }

}
