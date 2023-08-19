import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
	
    public static Board load(String filePath) throws IOException, InvalidMoveException {
        Board game = new Board();
        int lineNumber = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.matches("[XO][0-2][0-2]")) {
                	
                    char player = line.charAt(0);
                    int row = Character.getNumericValue(line.charAt(1));
                    int col = Character.getNumericValue(line.charAt(2));
                    if (!game.makeMove(player, row, col)) {
                    	
                        throw new InvalidMoveException(lineNumber);
                    }
              }               
          }
        }

        return game;
    }
}
