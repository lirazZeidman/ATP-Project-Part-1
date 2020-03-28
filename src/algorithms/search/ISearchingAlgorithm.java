package algorithms.search;

import algorithms.Solution;

public interface ISearchingAlgorithm {
    public Solution solve(algorithms.search.ISearchable maze);
    public String getName();
    public int getNumberOfNodesEvaluated();
}
