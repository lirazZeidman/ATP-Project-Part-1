package algorithms.search;

import org.jetbrains.annotations.NotNull;

public abstract class AState {
    protected Object CurNode; //distance or cost up to this point
    protected int Cost=0; // the cost of this point
                         //in our maze forward cost 10 and diagonal cost 15
     protected AState prev; // prevous node


    public AState(Object curNode, AState prev,int cost) {
        CurNode = curNode;
        Cost = cost;
        this.prev = prev;
    }

    public Object getCurNode() {
        return CurNode;
    }

    public int getCost() {
        return Cost;
    }

    public AState getPrev() {
        return prev;
    }

    abstract public String toString();

    public boolean equals(@NotNull AState b){
        return this.CurNode.equals(b.CurNode);
    }
}


