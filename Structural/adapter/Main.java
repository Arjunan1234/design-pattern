public class Main {
    public static void main(String[] args) {
        OldConsole oldConsole = new NintendoConsole();
        NewGame newGame = new XboxGame();

        OldConsole adaptedConsole = new GameAdapter(newGame);
        adaptedConsole.playOldGames();
    }
}
