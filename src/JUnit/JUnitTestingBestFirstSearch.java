import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import algorithms.search.AState;
import algorithms.search.BestFirstSearch;
import algorithms.search.SearchableMaze;
import algorithms.search.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class JUnitTestingBestFirstSearch {
    private BestFirstSearch BestFS= new BestFirstSearch();
    private Maze maze;
    private SearchableMaze searchableMaze;
    MyMazeGenerator mg= new MyMazeGenerator();

    public void build() {
        maze = mg.generate(100, 200);
        searchableMaze = new SearchableMaze(maze);
    }

    @Test
    public void TestSizeMaze() throws Exception {
        build();
        Assertions.assertEquals(200,maze.getColumnSize());
        Assertions.assertEquals(100,maze.getRowSize());
    }


    @Test
    public void getName() throws Exception { Assertions.assertEquals("BestFirstSearch",BestFS.getName());   }

    @Test
    public void TestStartOfSoultion() throws Exception {
        build();
        Solution solution= BestFS.solve(searchableMaze);
        ArrayList<AState> sol= solution.getSolutionPath();
        Assertions.assertEquals(maze.getStartPosition().toString(), sol.get(0).getCurNode());
    }
    @Test
    public void TestValidMove() throws  Exception{
        build();
        Solution solution= BestFS.solve(searchableMaze);
        ArrayList<AState> sol= solution.getSolutionPath();
        for (int i = 1; i <sol.size() ; i++) {
            Assertions.assertTrue(searchableMaze.getAllPossibleStates(sol.get(i)).contains(sol.get(i-1)));
        }
    }

    @Test
    public void TestGoalOfSoultion() throws Exception {
        build();
        Solution solution= BestFS.solve(searchableMaze);
        ArrayList<AState> sol= solution.getSolutionPath();
        Assertions.assertEquals(maze.getGoalPosition().toString(), sol.get(sol.size()-1).getCurNode());
    }


    @Test
    public void TestSolution() throws Exception{
        Solution solution= new Solution(null);
        Assertions.assertEquals(Integer.MAX_VALUE,solution.getCost());
    }
}