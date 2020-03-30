package algorithms.search;

import algorithms.mazeGenerators.Position;

public class MazeState extends AState   {


    public MazeState(Position curNode, AState prev, int cost) {
        super(curNode, prev, cost);
    }

    @Override
    public String toString() {
        return this.CurNode.toString();
    }

    public boolean equals(AState b){
        return this.CurNode.equals(b.CurNode);
    }
}
