import java.util.Arrays;

public class Maze {
    protected int ColumnSize;
    protected int RowSize;
    protected String[][] MazeTable;
    //TODO: change to string and change the print
    protected Position StartPosition;
    protected Position GoalPosition;
    private int Done;



    public void setMazeTable(String[][] mazeTable) {
        MazeTable = mazeTable;
    }

    public void setStartPosition(Position startPosition) {
        StartPosition = startPosition;
    }

    public void setGoalPosition(Position goalPosition) {
        GoalPosition = goalPosition;
    }

    public void setDone() {
        if (Done == 0) {
            Done = 1;
        }
    }

    public Maze(int rowSize, int columnSize) {
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new String[RowSize][ColumnSize];
        StartPosition=new Position(0,0);
        GoalPosition= new Position(rowSize,columnSize);
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

