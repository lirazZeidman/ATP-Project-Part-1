package algorithms.search;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {
    protected int NumberOfNodesEvaluated=0;
    //TODO the seqence of nodes in the way yo solution

    @Override
    public int getNumberOfNodesEvaluated() {
        return NumberOfNodesEvaluated;
    }
}
