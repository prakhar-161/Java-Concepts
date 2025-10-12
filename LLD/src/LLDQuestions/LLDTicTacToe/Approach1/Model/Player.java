package LLDQuestions.LLDTicTacToe.Approach1.Model;

public class Player {
    String name;
    PlayingPiece playerPlayingPiece;

    public Player(String name, PlayingPiece playerPlayingPiece) {
        this.name = name;
        this.playerPlayingPiece = playerPlayingPiece;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayerPlayingPiece() {
        return this.playerPlayingPiece;
    }

    public void setPlayerPlayingPiece() {
        this.playerPlayingPiece = playerPlayingPiece;
    }
}
