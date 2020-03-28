package algorithms.mazeGenerators;

public class Position  {
    private int RowIndex;
    private int ColumnIndex;

    public Position(int rowIndex, int columnIndex) {
        RowIndex = rowIndex;
        ColumnIndex = columnIndex;
    }
    public boolean isEqual(int row, int col){
        return RowIndex==row && ColumnIndex==col;
    }

    public boolean isEqual(Position p){
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


    protected boolean posNotDiagonallyTo(Position p){
        return RowIndex == p.getRowIndex() || ColumnIndex==p.getColumnIndex();
    }
    @Override

    public String toString() {
        return "{"+RowIndex+","+ColumnIndex+"}";
    }

}