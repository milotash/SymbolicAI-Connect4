import java.util.Scanner;
public class Main {
    
	static colPos
	static GameState gameBoard;
	static boolean win = false;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("New Connect 4 Game has started");
		gameBoard = new GameState();
		gameBoard.boardPrint();
		while(!win){
				System.out.println("Select Column to drop piece");
				colPos = in.nextInt();
				gameBoard.makeMovement(colPos, GameState.player);
				gameBoard.boardPrint();
		}
	}	

}