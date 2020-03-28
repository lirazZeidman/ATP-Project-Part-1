package algorithms.search;

import java.util.List;

public interface ISearchable {

    public List<AState> getAllPossibleStates(AState pos); //get all neighbors
    public AState getStart();
    public AState getGoal();
    public boolean Compare(AState x ,AState y );



//    public boolean



}
