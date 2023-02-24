package _tictactoe;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

/**
 * Das ist ein Test2
 * 
 */
public class ComputerAI {
    

    HashMap<String, List<int[]>> availableMoves = new HashMap<String, List<int[]>>();

    Game game;


    public ComputerAI(Game game){
        this.game = game;
    }
    public ComputerAI(){}

    public int[] calculateBestMove(){

    
        int[][] availableMoves = availableMoves();

        
        return new int[2];
    }


    public int[][] availableMoves(){
        int count = 0;
        int[][] currStateCopy = new int[9][2];

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(game.getValue(row, col).equals(game.emptyField)){
                    currStateCopy[count][0] = row;
                    currStateCopy[count++][1] = col;
                }
            }
        }
        return Arrays.copyOf(currStateCopy, count);
    }

    public int[] computerMove(){
        int min = 0;
        int[][] availableMoves = availableMoves();
        int max = availableMoves.length-1;

        
        int randomIndex = (int) (Math.random() * (max-min) + min);

        return new int[]{availableMoves[randomIndex][0], availableMoves[randomIndex][1]};

    }
    

}
