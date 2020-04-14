package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends  AMazeGenerator {

    @Override
       /**
     * creates and returns an EmptyMaze sized row*column
     * @param  row, column size of the wanted maze
     * @return maze has not walls, and has many different ways to solve
     */
    public Maze generate(int row, int column) {
        if(row<0 ||column<0)
            return null;
        Maze maze= new Maze(row,column);
        if(maze==null)
            return null;
        for (int i = 0; i <row ; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j]=0;
        maze.StartPosition=new Position(0,0);
        maze.GoalPosition= new Position(row-1,column-1);
        return maze;
    }
}
