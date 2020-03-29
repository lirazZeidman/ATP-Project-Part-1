package algorithms.search;

public abstract class AState {
    private int d=Integer.MAX_VALUE; //distance or cost up to this point
    private int Value=0; // the cost of this point
                         //in our maze forward cost 10 and diagonal cost 15
    private AState father; // prevous node

    public AState(int d, int value, AState father) {
        this.d = d;
        Value = value;
        this.father = father;
    }

    public int getD() {
        return d;
    }

    public AState getFather() {
        return father;
    }

    public int getValue() {
        return Value;
    }

    abstract public String toString();

}
