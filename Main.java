import java.io.IOException;

public class Main {
	
    public static void main(String[] args) {
    	
        try {
            Board game1 = File.load("game1.txt");
            
            System.out.println("TicTacToe Winner X :\n" + game1.toString());
            System.out.println("Winner: " + game1.Winnerchecker());

            Board game2 = File.load("game2.txt");
            
            System.out.println("TicTacToe Winner 'O':\n" + game2.toString());
            System.out.println("Winner: " + game2.Winnerchecker());

            Board game3 = File.load("game3.txt");
            
            System.out.println("\nDraw TicTacToe:\n" + game3.toString());
            System.out.println("Winner: " + game3.Winnerchecker());

            Board game4 = File.load("game4.txt");
            
            System.out.println("\nOngoing TicTacToe game:\n" + game4.toString());
            System.out.println("Winner: " + game4.Winnerchecker());

            Board game5 = File.load("game5.txt");
            
            System.out.println("\nWrong TicTacToe (InvalidMoveException)");

        } 
        catch (IOException | InvalidMoveException e) {
        	System.out.println("Error at line : " + 
        			((InvalidMoveException) e).getLineNumber());
        			e.printStackTrace();        
        			}
    }
}
