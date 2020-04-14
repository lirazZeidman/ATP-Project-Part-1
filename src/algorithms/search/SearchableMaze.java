package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.ArrayList;

public class SearchableMaze implements ISearchable {
    private Maze maze;

    public SearchableMaze(Maze maze) {
//        if (maze==null){
//
//        }
        this.maze = maze;
    }

    @Override
    public ArrayList<AState> getAllPossibleStates(AState StatePos) {
        if (StatePos == null || maze == null)
            return new ArrayList<AState>();
        ArrayList<AState> arrState = new ArrayList<AState>();

        Position pos = new Position(StatePos.getCurNode());
        ArrayList<Position> neighbors = maze.getMoveForSearcher(pos); // not sure this is the proper way to do it.
        for (Position tmpPos : neighbors) {
            if (pos.posNotDiagonallyTo(tmpPos))
                arrState.add(new MazeState(tmpPos, StatePos, StatePos.getCost() + 10));
            else
                arrState.add(new MazeState(tmpPos, StatePos, StatePos.getCost() + 15));
        }
        return arrState;

    }

    @Override
    public AState getStart() {
        if (maze == null)
            return null;
        return new MazeState(maze.getStartPosition(), null, 0);
    }


    @Override
    public AState getGoal() {
        if (maze == null)
            return null;
        return new MazeState(maze.getGoalPosition(), null, 0);
    }

    public boolean AreWeThereYet(AState state) {
        if (state == null)
            return false;
        return (getGoal().getCurNode()).equals(state.getCurNode());

    }
}


