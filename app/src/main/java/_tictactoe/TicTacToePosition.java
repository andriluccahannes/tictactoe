package _tictactoe;

public enum TicTacToePosition {

    TopLeft(0, 0),

    TopMiddle(0,1),

    TopRight(0,2),

    MiddleLeft(1, 0),

    MiddleMiddle(1,1),

    MiddleRight(1,2),

    BotLeft(2, 0),

    BotMiddle(2,1),

    BotRight(2,2);


    



    int row, col;

    TicTacToePosition(int row, int col){
        this.row = row;
        this.col = col;
    }


    public TicTacToePosition getPosition(int row, int col){

        for(TicTacToePosition currPosition: TicTacToePosition.values()){
            if(currPosition.row == row && currPosition.col==col){
                return currPosition;
            }
        }

        return null;
    }
}
