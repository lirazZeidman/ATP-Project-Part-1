package algorithms.search;

public abstract class AState {
    protected String CurNode; //distance or cost up to this point
    protected int Cost=0; // the cost of this point
                         //in our maze forward cost 10 and diagonal cost 15
     protected AState prev; // prevous node

    public AState(String curNode,  AState prev,int cost) {
        CurNode = curNode;
        Cost = cost;
        this.prev = prev;
    }

    public String getCurNode() {
        return CurNode;
    }

    public int getCost() {
        return Cost;
    }

    public AState getPrev() {
        return prev;
    }

     public  String toString(){
        return getCurNode().toString();
     };

    public  boolean equals(AState b){
        return getCurNode().equals(b.CurNode);
    }

//   public int compare(AState other){
//       int tCost=this.Cost,oCost=other.Cost;
//       if(tCost==oCost)
//           return 0;
//       if(tCost>oCost)
//           return 1;
//       return -1;
//   }
}


