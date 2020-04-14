package algorithms.mazeGenerators;

import java.util.Random;

public class SimpleMazeGenerator extends  AMazeGenerator {
    @Override
    /**
     * ccreates and returns a randomised SimpleMaze sized row*column
     * @param  row, column size of the wanted maze
     * @return maze has not walls, and has many different ways to solve
     */
    public Maze generate(int row, int column) {

        if( row<0 || column<0) //int can not be null
            //TODO Throw Exceptions
            return null;
        EmptyMazeGenerator emptymaker= new EmptyMazeGenerator();
        Maze maze = emptymaker.generate(row,column);
        if (row != 1 && column != 1) {// create instance of Random class
            Random rand = new Random();
            // Generate random integers in range 0 to 999
            int rand_start = rand.nextInt(column ) ; // -1 beacuse of the entrance +1 so it cant be 0
            int rand_wall = rand.nextInt(column ) ; // -1 beacuse of the entrance +1 so it cant be 0
            while (rand_start==rand_wall){
                rand_wall = rand.nextInt(column );
            }
            maze.MazeTable[0][rand_wall] = 1;
            maze.StartPosition= new Position(0,rand_start);
        }

        return maze;

    }
}

