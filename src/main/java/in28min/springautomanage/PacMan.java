package in28min.springautomanage;

public class PacMan implements GamingConsole {

    public void up(){
        System.out.println("PacManJump");
    }

    public void down(){
        System.out.println("PacMan Go into hole");
    }

    public void left(){
        System.out.println("PacMan Go Back");
    }

    public void right(){
        System.out.println("PacMan Accelerate");
    }


}
