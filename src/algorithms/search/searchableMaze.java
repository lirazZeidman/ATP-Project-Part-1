package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.ArrayList;

    public class searchableMaze implements ISearchable {
        private Maze maze;

        public searchableMaze(Maze maze) {
            this.maze = maze;
        }

        @Override
        public ArrayList<AState> getAllPossibleStates(AState StatePos) {
            ArrayList<AState> arrState = new ArrayList<AState>();
            if (Position.class != StatePos.getCurNode().getClass())
                return null;

            ArrayList<Position> neighbors = maze.getMoveForSearcher((Position) StatePos.getCurNode()); // not sure this is the proper way to do it.
            for (Position tmpPos : neighbors) {
                if (tmpPos.posNotDiagonallyTo((Position) StatePos.CurNode))
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
            return ((Position) getGoal().getCurNode()).equals((Position) state.getCurNode());

        }

//        @Override
//        public boolean isEqual(AState x, AState y) {
//            return false;
//        }
    }
