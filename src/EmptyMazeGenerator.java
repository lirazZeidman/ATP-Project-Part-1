public class EmptyMazeGenerator extends  AMazeGenerator {

    @Override
    //TODO we dont need the new class jus change it by Maze.mazetable[1][1]="0";
    public Maze generate(int row, int column) {
        Maze maze= new EmptyMaze(row,column);
        return maze;
    }
}
