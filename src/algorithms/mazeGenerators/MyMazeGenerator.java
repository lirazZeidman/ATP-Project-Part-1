import java.util.*;

public class MyMazeGenerator extends AMazeGenerator {

    private Stack<Position> stack = new Stack<>();
    private Random rand = new Random();
    private Maze maze;

    public Maze generate(int row, int column) {
        maze=new Maze(row,column);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j] = 1;

        //maze.MazeTable[0][0]=0;

        stack.push(maze.getStartPosition());
        stack.push(maze.getGoalPosition());
        Position nextPos = null;
        while(!stack.empty()){
            nextPos=stack.pop();

            if (!isValidNextMove(nextPos)) continue;
            maze.getMazeTable()[nextPos.getRowIndex()][nextPos.getColumnIndex()]=0;
            ArrayList<Position> neighbors= maze.getNextMoveNeighbors(nextPos);
            randomlyAddsNextPositionsToStack(neighbors);
        }
        return maze;
    }

    private void randomlyAddsNextPositionsToStack(ArrayList<Position> neighbors) {
        while (!neighbors.isEmpty()) {

            stack.push(neighbors.remove(rand.nextInt(neighbors.size() )));
        }
    }
    private boolean isValidNextMove(Position nextPos) {
        ArrayList<Position> NextMoveNeighbors=maze.getNextMoveNeighbors(nextPos);
        return NextMoveNeighbors.size()>2 && maze.getPosValue(nextPos)==1;

    }



}
