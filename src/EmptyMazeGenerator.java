public class EmptyMazeGenerator extends  AMazeGenerator {

    @Override
    //TODO we dont need the new class jus change it by Maze.mazetable[1][1]="0";
    public Maze generate(int row, int column) {
        Maze maze= new Maze(row,column);
        for (int i = 0; i <rowSize ; i++) {
            for (int j = 0; j <columnSize ; j++) {
                MazeTable[i][j]=0;
            }
        }
        StartPosition=new Position(0,0);
        GoalPosition= new Position(rowSize-1,columnSize-1);

    }

        return maze;

    }
}
