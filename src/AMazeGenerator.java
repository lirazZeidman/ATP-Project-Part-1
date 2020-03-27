public abstract class AMazeGenerator implements  IMazeGenerator{
    @Override
    public long measureAlgorithmTimeMillis(int row, int column) {
        long StartTime= System.currentTimeMillis();
        generate(row,column);
        long EndTime=System.currentTimeMillis();
        return EndTime-StartTime;
    }

}
