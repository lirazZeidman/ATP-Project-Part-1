package algorithms.mazeGenerators;

import java.util.ArrayList;
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
        StartPosition=new Position(0,1);
        GoalPosition= new Position(rowSize-1,columnSize-2);
    }


    public ArrayList<Position> getMoveForSearcher(Position pos){
        if(pos==null) //if we'll return null -> will be a lot to check later.
            return new ArrayList<>() ;
        int row=pos.getRowIndex(),col=pos.getColumnIndex();
        ArrayList<Position> neighbors = getAllNeighbors(pos);
        ArrayList<Position> searcherNeighbors = new ArrayList<>();
        ArrayList<Position> RevNeighbors = new ArrayList<>();
        for (Position tmpPos : neighbors){
            if(getPosValue(tmpPos)==0)
                RevNeighbors.add(tmpPos);
            }

        for (Position tmpPos : RevNeighbors){
            if(pos.posNotDiagonallyTo(tmpPos)) {
                searcherNeighbors.add(tmpPos);
                ArrayList<Position> tmpNeighbors = getAllNeighbors(tmpPos);
                for(Position tmpPos1 : tmpNeighbors){
                    if(getPosValue(tmpPos1)==0 && ListContains(RevNeighbors,tmpPos1)&& !ListContains(searcherNeighbors,tmpPos1))
                        searcherNeighbors.add(tmpPos1);
                }
            }
        }
        return searcherNeighbors;
    }
    public boolean ListContains(ArrayList<Position> lst, Position tocomp) {
        for (Position pos : lst) {
            if (pos.isEqual(tocomp))
                return true;
        }
        return false;
    }

    protected ArrayList<Position> getAllNeighbors(Position pos){

        if(pos==null) //if well return null -> will e a lot to check later.
            return new ArrayList<>() ;
        int row=pos.getRowIndex(),col=pos.getColumnIndex();
        Position tmpPos;
        ArrayList<Position> neighbors = new ArrayList<>();
        int [][] arr= {{row-1,col},{row-1,col+1},{row,col+1},{row+1,col+1},{row+1,col},{row+1,col-1},{row,col-1},{row-1,col-1}};
        for (int[] arg:arr){
        tmpPos = new Position(arg[0], arg[1]);
            if (PosOnMazeTable(tmpPos) && (!pos.equals(tmpPos)) )
                neighbors.add(tmpPos);
        }
        return neighbors;
    }

    protected ArrayList<Position> getMoveForGenerate(Position pos) {
        //dealing if pos=null i getNeighbors func.
        ArrayList<Position> neighbors = getAllNeighbors(pos);
        ArrayList<Position> NextMoveNeighbors = new ArrayList<>();
        for (Position tmpPos : neighbors)
            if (getPosValue(tmpPos) == 1 && pos.posNotDiagonallyTo(tmpPos))
                NextMoveNeighbors.add(tmpPos);

        return NextMoveNeighbors;
    }

    protected boolean PosOnMazeTable(Position nextPos){
        if (nextPos==null)
                return false;
        int x=nextPos.getRowIndex(),y=nextPos.getColumnIndex();
        return 0<=x && x<RowSize && 0<=y && y<ColumnSize;
    }

    protected int getPosValue(Position Pos) {
        if (Pos==null)
            return -1;//wont get here, checking first always if on board.
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


    public void print(){
        /*String out="";
        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                if(StartPosition.equals(i,j))
                    out+="S";
                else if(GoalPosition.equals(i,j))
                    out+="E";
                else
                    out+=MazeTable[i][j];
            }
            out+="\n";
        }
        System.out.println(out);*/

        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                if(StartPosition.equals(i,j))
                    System.out.print("S");
                else if(GoalPosition.equals(i,j))
                    System.out.print("E");
                else
                    System.out.print(MazeTable[i][j]);

            }
            System.out.println();
        }


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

