package algorithms.mazeGenerators;

import java.util.ArrayList;

public class Maze {
    protected int ColumnSize;
    protected int RowSize;
    protected int[][] MazeTable;
    protected Position StartPosition;
    protected Position GoalPosition;
    private String Table;



    public Maze(int rowSize, int columnSize) {
        if(rowSize<0 || columnSize <0){
            //TODO Throw Exceptions
            return;
        }
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new int[RowSize][ColumnSize];
        StartPosition=new Position(0,1);
        GoalPosition= new Position(rowSize-1,columnSize-2);
    }

    protected ArrayList<Position> getNeighbors(Position pos){
        int row=pos.getRowIndex(),col=pos.getColumnIndex();
        Position tmpPos = null;
        ArrayList<Position> neighbors = new ArrayList<>();
        for (int r=row-1;r<row+2;r++) for(int c=col-1;c<col+2;c++) { //checks all 9 possible positions from the left top point
            tmpPos = new Position(r, c);
            if (PosOnMazeTable(tmpPos) && (!pos.isEqual(tmpPos)) && pos.posNotDiagonallyTo(tmpPos))
                neighbors.add(tmpPos);
        }
        return neighbors;
    }

    protected ArrayList<Position> getNextMoveNeighbors(Position pos) {
        ArrayList<Position> neighbors = getNeighbors(pos);
        ArrayList<Position> NextMoveNeighbors = new ArrayList<>();
        for (Position tmpPos : neighbors)
            if (getPosValue(tmpPos) == 1)
                NextMoveNeighbors.add(tmpPos);

        return NextMoveNeighbors;
    }


    protected boolean PosOnMazeTable(Position nextPos){
        int x=nextPos.getRowIndex(),y=nextPos.getColumnIndex();
        return 0<=x && x<RowSize && 0<=y && y<ColumnSize;
    }

    protected int getPosValue(Position Pos) {
        return MazeTable[Pos.getRowIndex()][Pos.getColumnIndex()];
    }

    public int getColumnSize() {
        return ColumnSize;
    }

    public int getRowSize() {
        return RowSize;
    }

    public Position getStartPosition() {
        return StartPosition;
    }

    public Position getGoalPosition() {
        return GoalPosition;
    }

    public int[][] getMazeTable() {
        return MazeTable;
    }

    protected boolean onMazeTable(Position nextPos){
        int x=nextPos.getRowIndex(),y=nextPos.getColumnIndex();
        return 0<=x && x<=RowSize && 0<=y && y<=ColumnSize;
    }

    public void print(){
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
        System.out.println(out);

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
}

