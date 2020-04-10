package test;

import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.SimpleMazeGenerator;
import algorithms.search.*;

import java.util.ArrayList;

/**
 * Created by Aviadjo on 3/22/2017.
 */
class main {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("///"+i+"///");
            IMazeGenerator mg = new SimpleMazeGenerator();
            Maze maze = mg.generate(7, 14);

            maze.print();
            SearchableMaze searchableMaze = new SearchableMaze(maze);

            solveProblem(searchableMaze, new BreadthFirstSearch());
//            solveProblem(searchableMaze, new DepthFirstSearch());
            System.out.println("\n");

            solveProblem(searchableMaze, new BestFirstSearch());
            System.out.println("\n");
        }
    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm searcher) {
        //Solve a searching problem with a searcher
        long StartTime = System.currentTimeMillis();
        Solution solution = searcher.solve(domain);
        long EndTime = System.currentTimeMillis();

        System.out.print(String.format("'%s' algorithm - nodes evaluated: %s", searcher.getName(), searcher.getNumberOfNodesEvaluated()));
        System.out.print("    solution time - "+ (EndTime-StartTime));
        if(solution==null)
            System.out.println("\ncost is : : :   solution is null");
        else
            System.out.println("\ncost is : : :   "+solution.getCost());
//        Printing Solution Path
        System.out.println("Solution path:");
        ArrayList<AState> solutionPath = solution.getSolutionPath();
        for (int i = 0; i < solutionPath.size(); i++) {
            System.out.print(String.format("%s. %s",i,solutionPath.get(i)));
        }
    }
}


