//import algorithms.mazeGenerators.Maze;
//import algorithms.mazeGenerators.MyMazeGenerator;
//import algorithms.search.AState;
//import algorithms.search.BestFirstSearch;
//import algorithms.search.SearchableMaze;
//import algorithms.search.Solution;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//class JUnitTestingBestFirstSearch {
//    private BestFirstSearch BestFS= new BestFirstSearch();
//    private Maze maze;
//    private SearchableMaze searchableMaze;
//
//    public void build() {
//        MyMazeGenerator mg= new MyMazeGenerator();
//        maze = mg.generate(100, 200);
//        searchableMaze = new SearchableMaze(maze);
//    }
//
//    @Test
//    public void getName() throws Exception { Assertions.assertEquals("BestFirstSearch",BestFS.getName());   }
//
//    public void TestRegularSolution() throws Exception {
//        build();
//        Solution solution= BestFS.solve(searchableMaze);
//        ArrayList<AState> sol= solution.getSolutionPath();
//        Assertions.assertEquals(maze.getStartPosition().toString(), sol.get(0).getCurNode());
//        Assertions.assertEquals(maze.getGoalPosition().toString(), sol.get(sol.size()-1).getCurNode());
//    }
//
//    public void TestSolution() throws Exception{
//
//        Solution solution= new Solution(null);
//        Assertions.assertEquals(0,solution.getCost());
//    }
//}