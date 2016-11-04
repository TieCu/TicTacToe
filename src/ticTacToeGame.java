import java.io.IOException;

public class ticTacToeGame {
	
	public static void main(String[] args) throws IOException{
		player();
	}
	
	public static void player() throws IOException{
		String[] options = {"Single Player", "2 Players"};
		boolean quit = true;
		int menu = (ConsoleUI.promptForMenuSelection(options , quit));
		if(menu == 0){
			System.out.println("You quit Tic Tac Toe");
		}else if(menu == 1){
			//AI
		}else if(menu == 2){
			//game method
		}
		
	}
	
	/* Board, Square, Player, and Game are non-static
	 * Board ~ 2D char array --5:5, 2 and 4 are not used for char input
	 * Square ~ change 2D char array from empty to XO
	 * Player ~ Console UI
	 * Game ~ Main method
	 * 
	 * 
	 * */
	
	/*Tien's To-Do-List :D
	 * play again? ~loops
	 * menu ~finns (ish?)
	 * 
	 * */
	
	/* GAME ELEMENTS
	 * ConsoleUI
	 * Players take turns ~ X always first ~ XO no twice in a row turn
	 * Indicate win or stalemate ~ display game over
	 * board displays each turn
	 * no repeats
	 * no crashing
	 * export to jar
	 * zip zip file + jar
	 * */
	
}
