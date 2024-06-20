class GameAdapter implements OldConsole {
    private NewGame newGame;

    public GameAdapter(NewGame newGame) {
        this.newGame = newGame;
    }

    public void playOldGames() {
        newGame.playNewGames();
    }
}
