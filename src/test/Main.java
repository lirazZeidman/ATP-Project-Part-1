package test;

import algorithms.mazeGenerators.*;
import algorithms.search.*;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        IMazeGenerator mg = new MyMazeGenerator();
        Maze maze = mg.generate(15, 200);
        maze.print();
        SearchableMaze searchableMaze = new SearchableMaze(maze);

        solveProblem(searchableMaze, new BreadthFirstSearch());
        solveProblem(searchableMaze, new DepthFirstSearch());
        solveProblem(searchableMaze, new BestFirstSearch());

    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm searcher) {
        //Solve a searching problem with a searcher
        long StartTime = System.currentTimeMillis();
        Solution solution = searcher.solve(domain);
        long EndTime = System.currentTimeMillis();
        System.out.println("time to solve  " + (int) (EndTime - StartTime) + "(ms)");

        System.out.println(String.format("'%s' algorithm - nodes evaluated:%s", searcher.getName(), searcher.getNumberOfNodesEvaluated()));
        //Printing Solution Path
        System.out.println("Solution path:");
        ArrayList<AState> solutionPath = solution.getSolutionPath();
        System.out.println(solution.getCost());
//        for (int i = 0; i < solutionPath.size(); i++) {
//            if (i % 10 == 0)
//                System.out.println("->  ");
//            System.out.print(String.format(" %s.%s", i, solutionPath.get(i)));
//        }

    }
}


