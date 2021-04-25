public class GameState {
    int board[][];
    static final int X = 1;
    static final int O = -1;
    int NILL = 0;
    GamePlay lastPlay;
    int lastLetterUsed;
    int victor;
    String victorMethod;

    public GameState(){
        lastPlay = new GamePlay();
        lastLetterUsed = O;
        victor = O;
        board = new int[6][7];
        for(int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                board[i][j] = NILL;
            }
        }
    }

    public void mutateVictor(int victor){
        this.victor = victor;
    }

    public boolean moveable(int row, int col){

    }

    public boolean checkFullColumn(int col){

    }


    public void boardPrint(){
        for(int i=0; i<6; i++){
            for(int j=0; j<7; j++){
                if (board[i][j] == 1){
                    System.out.print("| " + "X ");
                } else if (board[i][j] == -1){
                    System.out.print("| " + "O ");
                } else {
                    System.out.println();
                }
            }
            System.out.println("| " + "-" + " ");
        }
        System.out.print("- 1 - 2 - 3 - 4 - 5 - 6 - 7 -");
    }
}