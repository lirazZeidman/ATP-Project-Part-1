import java.util.Random;

public class SimpleMazeGenerator extends  AMazeGenerator {
    @Override
    public Maze generate(int row, int column) {
        EmptyMazeGenerator emptymaker= new EmptyMazeGenerator();
        Maze maze = emptymaker.generate(row,column);
        if (row != 1 && column != 1) {// create instance of Random class
            Random rand = new Random();
            // Generate random integers in range 0 to 999
            int rand_int1 = rand.nextInt(column - 1) + 1; // -1 beacuse of the entrance +1 so it cant be 0
            maze.MazeTable[0][rand_int1] = 1;
        }
        return maze;

    }
}

