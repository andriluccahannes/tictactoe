package _tictactoe;

public enum Players {

    PLAYERONE("❌", 1),

    PLAYERTWO("⭕", 2),

    COMPUTERAI("🤖", 3);

    final String playerSymbol;

    final int playerValue;




    Players(String playerSymbol, int playerValue){
        this.playerSymbol = playerSymbol;
        this.playerValue = playerValue;
    }
    
}
