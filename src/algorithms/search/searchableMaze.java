package algorithms.search;

import java.util.List;

public class searchableMaze implements ISearchable {

    @Override
    public List<AState> getAllPossibleStates(AState pos) {
        return null;
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
