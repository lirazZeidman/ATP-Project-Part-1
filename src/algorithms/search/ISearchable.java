package algorithms.search;

import java.util.ArrayList;

public interface ISearchable {
    public ArrayList<AState> getAllPossibleStates(AState pos); //get all neighbors
    public AState getStart();
    public AState getGoal();
    boolean AreWeThereYet(AState x);
}
