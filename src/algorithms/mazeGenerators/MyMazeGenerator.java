package algorithms.mazeGenerators;

import java.util.*;

public class MyMazeGenerator extends AMazeGenerator {

    private Stack<Position> stack = new Stack<>();
    private Random rand = new Random();
    private Maze maze;

    public Maze generate(int row, int column) {
        if(row<0||column<0)
            return null;
        maze=new Maze(row,column);
        if(maze==null)
            return null;
        //TODO Throw Exceptions
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j] = 1;


        Random rand = new Random();
        int rand_int1 = rand.nextInt(column - 2) + 1; // -1 beacuse of the entrance +1 so it cant be 0
        maze.StartPosition=new Position(0,rand_int1);


        stack.push(maze.getStartPosition());
        Position nextPos = null;
        while(!stack.empty()){
            nextPos=stack.pop();

            if (!isValidNextMove(nextPos)) continue;
            maze.getMazeTable()[nextPos.getRowIndex()][nextPos.getColumnIndex()]=0;
            ArrayList<Position> neighbors= maze.getNextMoveNeighbors(nextPos);
            randomlyAddsNextPositionsToStack(neighbors);
        }
        lastE();
        return maze;
    }

    private void randomlyAddsNextPositionsToStack(ArrayList<Position> neighbors) {
        //if getting an empty arraylist-> wont do a thing here :)
        while (!neighbors.isEmpty()) {
            stack.push(neighbors.remove(rand.nextInt(neighbors.size() )));
        }
    }
    private boolean isValidNextMove(Position nextPos) {
        if(nextPos==null)
            return false;
        ArrayList<Position> NextMoveNeighbors=maze.getNextMoveNeighbors(nextPos);
        return NextMoveNeighbors.size()>2 && maze.getPosValue(nextPos)==1;

    }

    public void lastE(){
        int max= maze.getRowSize()*maze.getColumnSize()-1;
        while (max>1)  {
            int row= max/maze.getColumnSize();
            int column= max/maze.getRowSize();
            if (maze.MazeTable[row][column]==0){
                maze.GoalPosition= new Position(row+1,column);
                break;
            }
            max--;
        }
    }


}
