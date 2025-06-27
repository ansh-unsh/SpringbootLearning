package in28min.loosecoupling;

public class AppGamingBasic {
    public static void main(String[] args) {


        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();




    }
}
