package in28min.tightcoupling;

public class AppGamingBasic {
    public static void main(String[] args) {

//        var marioGame = new MarioGame();
//        var gameRunner = new GameRunner(marioGame);

        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);



        gameRunner.run();




    }
}
