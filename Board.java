
public class Board {
	
    private char[][] board;

    public Board() {
        board = new char[3][3];
        reset();
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }

    public boolean makeMove(char player, int row, int col) {
        if (board[row][col] == '_') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

        public char Winnerchecker() {
          
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_') {
                    return board[i][0];
                }
            }  // Check rows

           
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '_') {
                    return board[0][j];
                }
            } // Check columns

           
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '_') {
                return board[0][0];
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '_') {
                return board[0][2];
            } // Check diagonals

            
            boolean isDraw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        isDraw = false;
                        break;// draw or ongoing 
                    }
                }
            }

            return isDraw ? 'D' : 'O'; 
        }
   

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
