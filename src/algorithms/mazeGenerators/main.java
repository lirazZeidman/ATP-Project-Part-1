package algorithms.mazeGenerators;

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

       /* SimpleMazeGenerator SMG= new SimpleMazeGenerator();
        EmptyMazeGenerator Emg= new EmptyMazeGenerator();
        algorithms.mazeGenerators.Maze maze3 =  Emg.generate(3,3);
        maze3.Print();
        algorithms.mazeGenerators.Maze test1= SMG.generate(2,2);
        System.out.println((SMG.measureAlgorithmTimeMillis(1000,1000)));
        test1.Print();*/


        MyMazeGenerator MMG=new MyMazeGenerator();
        Maze m=MMG.generate(20,40);
//        System.out.println((MMG.measureAlgorithmTimeMillis(1000,20000)));
        m.print();

        System.out.println("hi :)");

    }
}