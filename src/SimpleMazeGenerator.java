public class SimpleMazeGenerator extends  AMazeGenerator {
    @Override
    public Maze generate(int row, int column) {
        EmptyMazeGenerator emptymaker= new EmptyMazeGenerator();

        Maze maze = emptymaker.generate(row,column);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j] = 0;
        maze.StartPosition = new Position(0, 0);
        maze.GoalPosition = new Position(row - 1, column - 1);
        return maze;
    }
}

