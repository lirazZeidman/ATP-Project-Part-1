package algorithms.search;

import algorithms.mazeGenerators.Maze;

import java.util.List;

public class searchableMaze implements ISearchable {
    private Maze maze;

    public searchableMaze(Maze maze) {
        this.maze = maze;
    }

    @Override
    public List<AState> getAllPossibleStates(AState pos) {
        pos.
    }

    @Override
    public AState getStart() {
        return null;
    }

    @Override
    public AState getGoal() {
        return null;
    }

    @Override
    public boolean Compare(AState x, AState y) {
        return false;
    }
}
