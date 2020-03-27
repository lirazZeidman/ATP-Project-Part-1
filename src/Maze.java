import java.util.Arrays;

public class Maze {
    protected int ColumnSize;
    protected int RowSize;
    protected String[][] MazeTable;
    //TODO: change to string and change the print
    protected Position StartPosition;
    protected Position GoalPosition;



    public Maze(int rowSize, int columnSize) {
        if(rowSize<1 || columnSize <1){
            //TODO Throw Exceptions
            return;
        }
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new String[RowSize][ColumnSize];
        StartPosition=new Position(0,0);
        GoalPosition= new Position(rowSize,columnSize);

    }

    public void setMazeTable(String[][] mazeTable) {
        if (mazeTable==null)
            return;
        //TODO Throw Exceptions
        MazeTable = mazeTable;
    }

    protected void setStartPosition( int row, int col) {
        if(row<0||col<0)
            return;
        //TODO Throw Exceptions
        if(row>=RowSize||col>=ColumnSize)
            return;
        //TODO Throw Exceptions
        StartPosition.setPosition(col,row);
        MazeTable[row][col]="S";
    }

    protected void setGoalPosition(  int row, int col) {
        if(row<0||col<0)
            return;
        //TODO Throw Exceptions
        if(row>=RowSize||col>=ColumnSize)
            return;
        //TODO Throw Exceptions

        GoalPosition.setPosition(col,row);
        MazeTable[row][col]="E";
    }


    public Position getStartPosition() {
        return StartPosition;
    }

    public Position getGoalPosition() {
        return GoalPosition;
    }

    public String[][] getMazeTable() {
        return MazeTable;
    }

    public void Print(){
        for (String[] row : MazeTable)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}

