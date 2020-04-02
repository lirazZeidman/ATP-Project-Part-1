package test;

import algorithms.mazeGenerators.*;

public class RunMazeGenerator {
    public static void main(String[] args) {
      // testMazeGenerator(new EmptyMazeGenerator());
      // testMazeGenerator(new SimpleMazeGenerator());
        for (int i = 0; i <5 ; i++) {
            //System.out.println("empty");
            //testMazeGenerator(new EmptyMazeGenerator());
            //System.out.println("simple");
            //testMazeGenerator(new SimpleMazeGenerator());
            //System.out.println("myMaze");
            testMazeGenerator(new MyMazeGenerator());
        }

    }

    private static void testMazeGenerator(IMazeGenerator mazeGenerator) {
        // prints the time it takes the algorithm to run
        System.out.println(String.format("algorithms.mazeGenerators.Maze generation time(ms): %s",
                mazeGenerator.measureAlgorithmTimeMillis(1000/*rows*/,1000/*columns*/)));
        // generate another maze
        //Maze maze = mazeGenerator.generate(1000/*rows*/, 1000/*columns*/);
        // prints the maze
       // maze.print();
        // get the maze entrance
        //Position startPosition = maze.getStartPosition();
        // print the position
        //System.out.println(String.format("Start algorithms.mazeGenerators.Position: %s",
                //startPosition)); // format "{row,column}"
        // prints the maze exit position
        //System.out.println(String.format("Goal algorithms.mazeGenerators.Position: %s",
                //maze.getGoalPosition()));
    }
}
