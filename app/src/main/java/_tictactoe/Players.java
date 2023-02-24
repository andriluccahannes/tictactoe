package _tictactoe;

public enum Players {

    PLAYERONE("❌"),

    PLAYERTWO("⭕");

    String playerSymbol;


    Players(String playerSymbol){
        this.playerSymbol = playerSymbol;
    }
    
}
