import java.util.Arrays;

class main {
    public static void main(String[] args) {
//        int[][] M = new int[6][6];
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                M[i][j] = 0;
//            }
//        }
//
//        int[][] v = new int[0][0];
        SimpleMazeGenerator SMG= new SimpleMazeGenerator();
        EmptyMazeGenerator Emg= new EmptyMazeGenerator();
        Maze maze3 =  SMG.generate(3,5);
        maze3.Print();
        Maze test1= SMG.generate(2,2);
//        System.out.println((SMG.measureAlgorithmTimeMillis(1000,1000)));
        System.out.println();



    }
}
