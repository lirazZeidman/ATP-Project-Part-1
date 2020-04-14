package test;

import algorithms.search.ISearchable;
import algorithms.search.ISearchingAlgorithm;
import algorithms.search.Solution;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Aviadjo on 3/22/2017.
 */
class main {
    public static void main(String[] args) {
//        for (int i = 0; i <1 ; i++) {
//            System.out.println("///"+i+"///");
//            IMazeGenerator mg = new SimpleMazeGenerator();
//            Maze maze = mg.generate(1000, 1000);
//
////            maze.print();
//            SearchableMaze searchableMaze = new SearchableMaze(maze);
//
//            solveProblem(searchableMaze, new BreadthFirstSearch());
//            solveProblem(searchableMaze, new DepthFirstSearch());
//            solveProblem(searchableMaze, new BestFirstSearch());
//
//        }
        Queue<Integer> q;
        q= new PriorityQueue<>((x, y) -> x - y);
        q.add(10);
        q.add(5);
        q.add(15);
        System.out.println(q.peek());

    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm searcher) {
        //Solve a searching problem with a searcher
        long StartTime = System.currentTimeMillis();
        Solution solution = searcher.solve(domain);
        long EndTime = System.currentTimeMillis();

        System.out.println(String.format("'%s' algorithm - nodes evaluated: %s", searcher.getName(), searcher.getNumberOfNodesEvaluated()));
        System.out.println("    solution time - "+ (EndTime-StartTime));
        if(solution==null)
            System.out.println("\ncost is : : :   solution is null");
        else
            System.out.println("\ncost is : : :   "+solution.getCost());
//        Printing Solution Path
//        System.out.println("Solution path:");
//        ArrayList<AState> solutionPath = solution.getSolutionPath();
//        for (int i = 0; i < solutionPath.size(); i++) {
//            System.out.print(String.format("%s. %s",i,solutionPath.get(i)));
//        }
    }
}


