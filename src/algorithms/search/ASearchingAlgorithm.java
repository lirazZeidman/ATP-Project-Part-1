package algorithms.search;

import java.util.ArrayList;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {
    protected int NumberOfNodesEvaluated=0;
    //TODO the seqence of nodes in the way yo solution

    @Override
    public int getNumberOfNodesEvaluated() {
        return NumberOfNodesEvaluated;
    }
    public boolean ListContains(ArrayList<AState> lst, AState tocomp) {
        for (AState pos : lst) {
            if (pos.equals(tocomp))
                return true;
        }
        return false;
    }
}
