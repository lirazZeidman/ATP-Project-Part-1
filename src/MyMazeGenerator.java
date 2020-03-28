import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class MyMazeGenerator extends AMazeGenerator {
    @Override
    public Maze generate(int row, int column) {
        Maze maze = new Maze(row, column);
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) maze.MazeTable[i][j] = 1;


//        Set<Integer> edges= new HashSet<>((column-1)*row +  (row-1)*column);

        Set<Integer> Cells= new HashSet<>(column*row );
        while (!edges.isEmpty()){
            int edge=
        }


    }
}
