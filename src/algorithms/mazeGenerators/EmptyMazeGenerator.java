package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends  AMazeGenerator {

    @Override
    public Maze generate(int row, int column) {
        Maze maze= new Maze(row,column);
        for (int i = 0; i <row ; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j]=0;
        maze.StartPosition=new Position(0,0);
        maze.GoalPosition= new Position(row-1,column-1);
        return maze;
    }
}
