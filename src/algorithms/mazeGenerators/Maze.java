package algorithms.mazeGenerators;

import java.util.ArrayList;
public class Maze {
    private int ColumnSize;
    private int RowSize;
   public  int[][] MazeTable;
   public Position StartPosition;
   public Position GoalPosition;

    /**
     * creates a maze - initialing the datat of the maze.
     * @param rowSize - size of the maze
     * @param columnSize - size of the maze
     */
    public Maze(int rowSize, int columnSize) {
        if (rowSize < 0 || columnSize < 0) {
            //TODO Throw Exceptions
            return;
        }
        ColumnSize = columnSize;
        RowSize = rowSize;
        MazeTable = new int[RowSize][ColumnSize];
        StartPosition = new Position(0, 1);
        GoalPosition = new Position(rowSize - 1, columnSize - 2);
    }

    /**
     *find and returns all moves from the position pos that the searcher can commit.
     * valid diagonal and regular moves.
     * @param pos
     * @return positions ArrayList of all posible moves from the position pos that the searcher can commit.
     */
    public ArrayList<Position> getMoveForSearcher(Position pos) {
        if (pos == null) //if we'll return null -> will be a lot to check later.
            return new ArrayList<>();
        int row = pos.getRowIndex(), col = pos.getColumnIndex();
        ArrayList<Position> neighbors = getAllNeighbors(pos);
        ArrayList<Position> searcherNeighbors = new ArrayList<>();
        ArrayList<Position> RevNeighbors = new ArrayList<>();
        for (Position tmpPos : neighbors) {
            if (getPosValue(tmpPos) == 0)
                RevNeighbors.add(tmpPos);
        }

        for (Position tmpPos : RevNeighbors) {
            if (pos.posNotDiagonallyTo(tmpPos)) {
                searcherNeighbors.add(tmpPos);
                ArrayList<Position> tmpNeighbors = getAllNeighbors(tmpPos);
                for (Position tmpPos1 : tmpNeighbors) {
                    if (getPosValue(tmpPos1) == 0 && ListContains(RevNeighbors, tmpPos1) && !ListContains(searcherNeighbors, tmpPos1))
                        searcherNeighbors.add(tmpPos1);
                }
            }
        }
        return searcherNeighbors;
    }

    /**
     * checks if the  arrayist list contains position tocomp
     * @param lst -  checking in this list
     * @param tocomp - checking if this in the list
     * @return boolean value -true if lst contains tocomp
     */
    public boolean ListContains(ArrayList<Position> lst, Position tocomp) {
        for (Position pos : lst) {
            if (pos.isEqual(tocomp))
                return true;
        }
        return false;
    }


    /**
     * calculating all neighbors on the maze table from position pos
     * including regular and diagonal neighbors.
     * @param pos - calculating from this position
     * @return an array list that contains all posible moves
     */
    protected ArrayList<Position> getAllNeighbors(Position pos) {

        if (pos == null) //if well return null -> will e a lot to check later.
            return new ArrayList<>();
        int row = pos.getRowIndex(), col = pos.getColumnIndex();
        Position tmpPos;
        ArrayList<Position> neighbors = new ArrayList<>();
        int[][] arr = {{row - 1, col}, {row - 1, col + 1}, {row, col + 1}, {row + 1, col + 1}, {row + 1, col}, {row + 1, col - 1}, {row, col - 1}, {row - 1, col - 1}};
        for (int[] arg : arr) {
            tmpPos = new Position(arg[0], arg[1]);
            if (PosOnMazeTable(tmpPos) && (!pos.equals(tmpPos)))
                neighbors.add(tmpPos);
        }
        return neighbors;
    }

    /**
     * returns all valid moves to generate the maze - valid regular moves only
     * @param pos all valid regular moves from this position
     * @return an positions array list contains the valid regular
     */
    protected ArrayList<Position> getMoveForGenerate(Position pos) {
        //dealing if pos=null i getNeighbors func.
        ArrayList<Position> neighbors = getAllNeighbors(pos);
        ArrayList<Position> NextMoveNeighbors = new ArrayList<>();
        for (Position tmpPos : neighbors)
            if (getPosValue(tmpPos) == 1 && pos.posNotDiagonallyTo(tmpPos))
                NextMoveNeighbors.add(tmpPos);

        return NextMoveNeighbors;
    }

    /**
     * checks if nextpos data (row,column) is  on the mazeTable
     * @param nextPos
     * @return a boolean value - true if on the maze table , else -false
     */
    protected boolean PosOnMazeTable(Position nextPos) {
        if (nextPos == null)
            return false;
        int x = nextPos.getRowIndex(), y = nextPos.getColumnIndex();
        return 0 <= x && x < RowSize && 0 <= y && y < ColumnSize;
    }

    /**
     * returns the tableMAze value of the position
     * @param Pos
     * @return 0 or 1
     */
    protected int getPosValue(Position Pos) {
        if (Pos == null)
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

    /**
     * prints the maze table be the given Instructions
     */
    public void print() {
        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                if (StartPosition.equals(i, j))
                    System.out.print("S");
                else if (GoalPosition.equals(i, j))
                    System.out.print("E");
                else
                    System.out.print(MazeTable[i][j]);
            }
            System.out.println();
        }


    }

}