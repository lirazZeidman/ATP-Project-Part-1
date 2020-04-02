package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.MyMazeGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestFirstSearchTest {
    private BestFirstSearch bfs= new BestFirstSearch();

    @Test
    void getName() {
        assertEquals("BestFirstSearch",bfs.getName());
    }


    @Test
    void TestSoltion() {
        MyMazeGenerator mg= new MyMazeGenerator();
        Maze maze = mg.generate(100, 200);
        SearchableMaze searchableMaze = new SearchableMaze(maze);
        Solution solution= bfs.solve(searchableMaze);
        ArrayList<AState> sol= solution.getSolutionPath();
        assertEquals(maze.getStartPosition().toString(), sol.get(0).CurNode);
    }

    @Test
    void testGetName() {
    }
}