package _tictactoe;

import java.util.Arrays;


/**
 * This class manages a TicTacToes Game's state.
 * 
 */
public class Game {
    
    String[][] currState = new String[3][3];

    final String emptyField = "⬛";

    
    public Game(){
        for(String row[]: currState){
            Arrays.fill(row, emptyField);
        }
    }

    /**
     *  
     * This Method prints out the current state of the game to the console
     * 
     */
    public void printGame(){
        System.out.println("  0  1  2");
        for(int row = 0; row < currState.length; row++){
            System.out.print(row );
            for(int col = 0; col < currState[row].length; col++){

                System.out.print("[" + currState[row][col] + "]");
            }
            System.out.println();
        }
    }
    
    public String checkStatus(){
        
        for(int i = 0; i < 3; i++){
            if(compareCol(i)){
                return currState[0][i];
            }
        }
        for(int i = 0; i < 3; i++){
            if(compareRow(i)){
                return currState[i][0];
            }
        }
        if(compareFirstDiagonal()){
            return currState[0][0];
        }else if(compareSecondDiagonal()){
            return currState[0][2];
        }
        return null;
    }

    /**
     * This Method sets the Value of a field.
     * 
     * @param row The row of the field
     * @param col The Column of the field
     * @param player the Player that is updating the field
     */
    public void setValue(int row, int col, Players player){
        currState[row][col] = player.playerSymbol;
    }
    
    /**
     * Returns the String that is set in a field.
     * @param row
     * @param col
     * @return Returns the String that is set in a field.
     */
    public String getValue(int row, int col){
        return currState[row][col];
    }

    private boolean compareCol(int col){
        if(currState[0][col].equals(currState[1][col]) && 
        currState[0][col].equals(currState[2][col]) && 
        !currState[0][col].equals(emptyField)){

            return true;        
        }
        return false;
    }

    private boolean compareRow(int row){
        if(currState[row][0].equals(currState[row][1]) && 
        currState[row][0].equals(currState[row][2]) && 
        !currState[row][0].equals(emptyField)){

            return true;        
        }
        return false;
    }

    private boolean compareFirstDiagonal(){
        if(currState[0][0].equals(currState[1][1]) && 
        currState[0][0].equals(currState[2][2]) && 
        !currState[0][0].equals(emptyField)){

            return true;        
        }
        return false;
    }


    private boolean compareSecondDiagonal(){
        if(currState[0][2].equals(currState[1][1]) && currState[0][2].equals(currState[2][0])&& !currState[0][2].equals(emptyField)){
            return true;        
        }
        return false;
    }


    /**
     * This method checks weather a move (given a row and column) is legal or not
     * 
     * @param row Row Position
     * @param col Col Position
     * @return Returns true of move is legal and false if move is not legal
     */
    public boolean checkLegalMove(int row, int col){
        return getValue(row, col).equals(emptyField);
    }
}
