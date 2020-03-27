import java.util.Arrays;

public class Maze {
    protected int ColumnSize;
    protected int RowSize;
    protected int[][] MazeTable;
    protected Position StartPosition;
    protected Position GoalPosition;



    public Maze(int rowSize, int columnSize) {
        if(rowSize<0 || columnSize <0){
            //TODO Throw Exceptions
            return;
        }
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new int[RowSize][ColumnSize];
        StartPosition=new Position(0,0);
        GoalPosition= new Position(rowSize,columnSize);
    }
//
//    public void setMazeTable(String[][] mazeTable) {
//        if (mazeTable==null)
//            return;
//        //TODO Throw Exceptions
//        MazeTable = mazeTable;
//    }
//
//    protected void setStartPosition( int row, int col) {
//        if(row<0||col<0)
//            return;
//        //TODO Throw Exceptions
//        if(row>=RowSize||col>=ColumnSize)
//            return;
//        //TODO Throw Exceptions
//        StartPosition.setPosition(col,row);
//        MazeTable[row][col]="S";
//    }
//
//    protected void setGoalPosition(  int row, int col) {
//        if(row<0||col<0)
//            return;
//        //TODO Throw Exceptions
//        if(row>=RowSize||col>=ColumnSize)
//            return;
//        //TODO Throw Exceptions
//
//        GoalPosition.setPosition(col,row);
//        MazeTable[row][col]="E";
//    }


    public Position getStartPosition() {
        return StartPosition;
    }

    public Position getGoalPosition() {
        return GoalPosition;
    }

    public int[][] getMazeTable() {
        return MazeTable;
    }

    public void Print(){
        String out="";
        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                if(StartPosition.isEqual(i,j))
                    out+="S";
                else if(GoalPosition.isEqual(i,j))
                    out+="E";
                else
                    out+=MazeTable[i][j];
            }
            out+="\n";
        }

    }
}

