package test;

import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.SimpleMazeGenerator;
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
        for(int i=0;i<3;i++){
            System.out.println("/////"+i+"/////");
            IMazeGenerator mg = new SimpleMazeGenerator();
            Maze maze = mg.generate(1000, 1000);
            SearchableMaze searchableMaze = new SearchableMaze(maze);
            BreadthFirstSearch bfs= new BreadthFirstSearch();
            //maze.print();
            solveProblem(searchableMaze,bfs);
            BestFirstSearch befs= new BestFirstSearch();
            solveProblem(searchableMaze,  befs);}
    }

    private static void solveProblem(ISearchable domain, ISearchingAlgorithm searcher) {
        //Solve a searching problem with a searcher
        Solution solution = searcher.solve(domain);
        System.out.println(String.format("'%s' algorithm - nodes evaluated: %s",searcher.getName() ,searcher.getNumberOfNodesEvaluated()));
        //Printing Solution Path

//            System.out.println("  cost is : : :   "+solution.getCost());
//        System.out.println("Solution path:\n");
//        ArrayList<AState> solutionPath = solution.getSolutionPath();
//        for (int i = 0; i < solutionPath.size(); i++) {
//            System.out.print(String.format("%s. %s",i,solutionPath.get(i)));
//        }
    }
}