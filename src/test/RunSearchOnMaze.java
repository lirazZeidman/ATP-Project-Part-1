package test;

import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import algorithms.search.*;

/**
 * Created by Aviadjo on 3/22/2017.
 */
public class RunSearchOnMaze {
    public static void main(String[] args) {
//        IMazeGenerator mg = new EmptyMazeGenerator();
//        Maze maze = mg.generate(3, 3);
//
//
//        maze.GoalPosition=new Position(0,0);
//        maze.StartPosition=new Position(2,0);
//        SearchableMaze searchableMaze = new SearchableMaze(maze);
//
        for(int i=0;i<1;i++){
            System.out.println("/////"+i+"/////");
            IMazeGenerator mg = new MyMazeGenerator();
            Maze maze = mg.generate(8, 21);
            SearchableMaze searchableMaze = new SearchableMaze(maze);
            BreadthFirstSearch bfs= new BreadthFirstSearch();   maze.print();
            solveProblem(searchableMaze,bfs);
        //        solveProblem(searchableMaze, new DepthFirstSearch());

            BestFirstSearch befs= new BestFirstSearch();
            solveProblem(searchableMaze,  befs);}
    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm searcher) {
        //Solve a searching problem with a searcher
        Solution solution = searcher.solve(domain);
        System.out.println(String.format("algorithm - nodes evaluated: %s", searcher.getNumberOfNodesEvaluated()));
        //Printing Solution Path

            System.out.println("  cost is : : :   "+solution.getCost());
//        System.out.println("Solution path:\n");
//        ArrayList<AState> solutionPath = solution.getSolutionPath();
//        for (int i = 0; i < solutionPath.size(); i++) {
//            System.out.print(String.format("%s. %s",i,solutionPath.get(i)));
//        }
    }
}