package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.ArrayList;

    public class SearchableMaze implements ISearchable {
        private Maze maze;

        public SearchableMaze(Maze maze) {
            this.maze = maze;
        }

        @Override
        public ArrayList<AState> getAllPossibleStates(AState StatePos) {
            ArrayList<AState> arrState = new ArrayList<AState>();

            Position pos = new Position(StatePos.getCurNode());
            ArrayList<Position> neighbors = maze.getMoveForSearcher(pos); // not sure this is the proper way to do it.
            for (Position tmpPos : neighbors) {
                if (tmpPos.posNotDiagonallyTo(pos))
                    arrState.add(new MazeState(tmpPos, StatePos, StatePos.getCost()+10));
                else
                    arrState.add(new MazeState(tmpPos, StatePos, StatePos.getCost()+15));
            }
            return arrState;

        }

        @Override
        public AState getStart() {
            return new MazeState(maze.getStartPosition(), null, 0);
        }


        @Override
        public AState getGoal() {
            return new MazeState(maze.getGoalPosition(), null, 0);
        }

        public boolean AreWeThereYet(AState state) {
            return (getGoal().getCurNode()).equals( state.getCurNode());

        }

//        @Override
//        public boolean isEqual(AState x, AState y) {
//            return false;
//        }
    }
