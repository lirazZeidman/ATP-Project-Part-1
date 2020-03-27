public abstract class Maze {
    protected int ColumnSize;
    protected int RowSize;
    protected int[][] MazeTable;
    //TODO: change to string and change the print
    protected Position StartPosition;
    protected Position GoalPosition;

    public Maze(int rowSize, int columnSize) {
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new int[RowSize][ColumnSize];
        StartPosition=new Position(0,0);
        GoalPosition= new Position(rowSize,columnSize);
    }

    public Position getStartPosition() {
        return StartPosition;
    }

    public Position getGoalPosition() {
        return GoalPosition;
    }

    public void Print(){
        String Out="[";
        for (int i = 0; i <RowSize ; i++) {
            for (int j = 0; j <ColumnSize ; j++) {
                if(StartPosition.getRowIndex()==i && StartPosition.getColumnIndex()==j){
                    Out+=" S ";
                }
                else if(GoalPosition.getRowIndex()==i && GoalPosition.getColumnIndex()==j){
                    Out+=" E ";
                }
                else
                    Out+=MazeTable[i][j];
            }
            Out+="]\n[";
        }
        System.out.println(Out+"]");
    }
}

