package test;
import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import algorithms.search.*;
import java.util.ArrayList;

public class RunSearchOnMaze {
    public static void main(String[] args) {
        IMazeGenerator mg = new MyMazeGenerator();
        Maze maze = mg.generate(10, 10);
        maze.print();

        SearchableMaze searchableMaze = new SearchableMaze(maze);

        //solveProblem(searchableMaze, new BreadthFirstSearch());
        solveProblem(searchableMaze, new BestFirstSearch());
//        solveProblem(searchableMaze, new DepthFirstSearch());
//        solveProblem(searchableMaze, new DepthFirstSearch());


        System.out.println("hi :)");

    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm
            searcher) {
        //Solve a searching problem with a searcher
        long StartTime = System.currentTimeMillis();
        Solution solution = searcher.solve(domain);
        long EndTime = System.currentTimeMillis();
        System.out.println("time to solve  "+(int) (EndTime - StartTime) +"(ms)");


//        System.out.println(String.format("'%s' algorithm - nodes evaluated: %s", searcher.getName(), searcher.getNumberOfNodesEvaluated()));
        //Printing Solution Path
        System.out.println("Solution path:");
        ArrayList<AState> solutionPath = solution.getSolutionPath();
        /*for (int i = 0; i < solutionPath.size(); i++) {
            if (i % 10 == 0)
                System.out.println("");
            System.out.print(String.format("%s.%s", i, solutionPath.get(i)));

        }*/
    }
}